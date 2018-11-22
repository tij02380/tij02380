#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <string.h>
#define SIZE 50

int pt; //block의 크기
char filename[SIZE]; //분할될 파일명
char *fname[1]; //분할할 파일명
char *create[1]; //병렬로 저장된 파일의 이름을 저장하는 파일명(분활된 파일 명을 만들때 사용)
char *tnew[1]; //병렬로 저장된 파일의 이름을 저장하는 파일명
int t=0; //thread번호

void *Thread(void *arg) { //파일분할저장
	FILE *rf, *wf, *rfile;
	char buffer[pt]; //한 block만큼의 buffer 선언

	sprintf(filename,"%d",t); //thread 번호를 받아서
	strcat(filename,*create); //분할하여 만들어질 새로운 파일명을 filename에 저장

	rf=fopen(*fname,"r"); //분할할 파일을 열고
	wf=fopen(filename,"w"); //새로 저장될 파일을 연다
	rfile=fopen(*tnew,"a"); //파일명들을 병렬로 저장할 파일
	fseek(rf, t*pt, SEEK_SET); // thread가 실행될때마다 포인터의 위치를 block단위로 옮겨가며
	fread(buffer,sizeof(buffer),1,rf); //분할할 파일을 읽어서
	fwrite(buffer,sizeof(buffer),1,wf); //저장한다
	fclose(rf);
	fclose(wf);
	t++;

	fputs(filename,rfile); //파일명을 병렬로 저장
	fputs(" ", rfile);
	fclose(rfile);
	pthread_exit(0);
}

void store(char *new, int k) { //store 부분
	int i;
	pthread_t threads[k]; //thread 생성
	int thread_num[k]; 

	tnew[0]=new; //병렬로 저장된 파일의 이름을 저장하는 파일명을 넘겨준다.(thread에서 사용하기 위해)

	for(i=0;i<k;i++) { //n block으로 나눌 만큼 thread를 생성한다.
		thread_num[i]=i;
		pthread_create(&threads[i],NULL,Thread,&thread_num[i]);
	}
	for(i=0; i<k; i++)
		pthread_join(threads[i],NULL);
	
}

void reader(char *old, char *new) { //read 부분
	int i;
	char refilename[50]; //분할된 파일명을 여기에 저장함
	FILE *re;
	re=fopen(old,"r"); //병렬로 저장된 파일명이 들어있는 파일의

	char s;

	if(re==NULL) printf("파일없음\n");//존재 유무를 판단하여서 존재하면 read를 진행하고 아니면 파일없음 출력
	else {
		while(1) {
			sprintf(refilename,"%d",i); //store에서와 같은 방식으로 파일 명을 refilename에 저장한다
			strcat(refilename,old);
			FILE *fr, *fw;
			fr=fopen(refilename,"r"); 
			fw=fopen(new,"a"); //새로 재 저장할 파일에
			
			while((s=fgetc(fr))!=EOF)
				fprintf(fw,"%c",s); //분할된 파일의 내용을 작성하여 하나의 파일로 합친다.
			
			fclose(fr);
			fclose(fw);
			i++;
		}
	}
	fclose(re);
	
}

void main()
{
	char *arg[4]; //pipe를 통할 배열
	char *sarg[3]; //list 저장을 위한 배열
	char buf1[4], buf2[4]; //임시 저장소
	char type[SIZE],old[SIZE],new[SIZE],n[SIZE]; //scanf로 입력받은 string 저장할 배열
	int pipes[2], i; //pipe
	int c; //store read list에 따라 저장되는 수 다름
	

	while(1) { //무한반복

	if(pipe(pipes) == -1) {
		perror("pipe failed");
		exit(1);
	}
	
	if(fork()) { //client
		printf("'store' or 'read' or 'list' : \n");
		scanf("%s",type); //type 입력
		if(strcmp(type,"store")==0) { //store일 경우
			c = 4; //pipe로 보낼 변수가 4개
			scanf("%s %s %s", old,new,n); //나머지 3가지 변수를 입력받음
			arg[0]=type;
			arg[1]=old;
			arg[2]=new;
			arg[3]=n; //arg 포인터로 입력받은 배열을 연결
		}
		else if(strcmp(type,"read")==0) { //read일 경우
			c=3; //pipe로 보낼 변수가 3개
			scanf("%s %s", old,new); //나머지 2가지 변수를 입력받음
			arg[0]=type;
			arg[1]=old;
			arg[2]=new;//arg 포인터로 입력받은 배열을 연결
		}
		else if(strcmp(type,"list")==0) { //list일 경우
			c=1;//pipe로 보낼 변수가 1개
			arg[0]=type;//arg 포인터로 입력받은 배열을 연결
		}
		else //store read list가 아닐경우
			printf("wrong!!"); 
		
		//client가 file server로 요청
		for(i=0; i<c; i++) { //pipe를 통하여 file server로 보냄 
		write(pipes[1], arg[i], SIZE);
		}
		
	    
   	}
	else { //file server
		
		read(pipes[0], type, SIZE); //client에서 온 내용을 읽어들인다
		if(strcmp(type,"store")==0) { //store일 때
			read(pipes[0], old, SIZE);
			fname[0]=old; //thread에서 사용하기 위해
			read(pipes[0], new, SIZE);
			sarg[0]=new; //list에 저장하기 위해
			create[0]=new;  //thread에서 사용하기 위해
			read(pipes[0], n, SIZE);
			sarg[2]=n;//list에 저장하기 위해
			int k = atoi(n); //char->int

			FILE *fp, *meta;
			fp=fopen(old,"r"); //파일의 크기를 알기위해 연다
			meta=fopen("metafile.txt", "a"); //list를 위한 metafile.txt

			fseek(fp,0,SEEK_END);
			int fsize=ftell(fp); //파일크기를 측정 후 fsize에 저장
			fclose(fp); 
			
			sprintf(buf2,"%d",fsize); //int->char
			sarg[1]=buf2; // 파일의 크기
			
			pt=fsize/k; //block의 크기

			for(i=0; i<3; i++) { //list에 필요한 내용을 metafile.txt에 저장
				fputs(sarg[i], meta);
				fputs("\t",meta);
			}
			fputs("\n",meta);
			fclose(meta);
			
			store(new,k); //store함수로 넘어가서 파일을 분할함
			
		}
		else if(strcmp(type,"read")==0) { //read일 때
			read(pipes[0], old, SIZE);//client요청을 받아들여
			read(pipes[0], new, SIZE);
			reader(old,new);	// reader함수로 넘어가서 역할을 수행함
		}
		else if(strcmp(type,"list")==0) { //list일 때
			FILE *list;
			list=fopen("metafile.txt","r"); //metafile.txt을 열어서
			char s;
			if(list==NULL) printf("파일없음\n"); //metafile.txt가 없다면 store 된 파일이 없다는 뜻이므로 "파일없음"출력
			else {
				while((s=fgetc(list))!=EOF) //list를 출력함
					printf("%c",s);
			}
			
			fclose(list);
			
		}
		else
			printf("wrong!\n"); //잘못된 경우를 대비하여 wrong출력
    		exit(0);
	}
	}
}
