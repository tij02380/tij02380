#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <string.h>
#define SIZE 50

int pt; 
char filename[SIZE]; 
char *fname[1]; 
char *create[1]; 
char *tnew[1]; 
int t=0; 

void *Thread(void *arg) {
	FILE *rf, *wf, *rfile;
	char buffer[pt];

	sprintf(filename,"%d",t); 
	strcat(filename,*create); 

	rf=fopen(*fname,"r"); 
	wf=fopen(filename,"w");
	rfile=fopen(*tnew,"a"); 
	fseek(rf, t*pt, SEEK_SET); 
	fread(buffer,sizeof(buffer),1,rf); 
	fwrite(buffer,sizeof(buffer),1,wf); 
	fclose(rf);
	fclose(wf);
	t++;

	fputs(filename,rfile); 
	fputs(" ", rfile);
	fclose(rfile);
	pthread_exit(0);
}

void store(char *new, int k) { 
	int i;
	pthread_t threads[k]; 
	int thread_num[k]; 

	tnew[0]=new; 

	for(i=0;i<k;i++) { 
		thread_num[i]=i;
		pthread_create(&threads[i],NULL,Thread,&thread_num[i]);
	}
	for(i=0; i<k; i++)
		pthread_join(threads[i],NULL);
	
}

void reader(char *old, char *new) { 
	int i;
	char refilename[50]; 
	FILE *re;
	re=fopen(old,"r"); 

	char s;

	if(re==NULL) printf("파일없음\n");
	else {
		while(1) {
			sprintf(refilename,"%d",i); 
			strcat(refilename,old);
			FILE *fr, *fw;
			fr=fopen(refilename,"r"); 
			fw=fopen(new,"a"); 
			
			while((s=fgetc(fr))!=EOF)
				fprintf(fw,"%c",s); 
			
			fclose(fr);
			fclose(fw);
			i++;
		}
	}
	fclose(re);
	
}

void main()
{
	char *arg[4]; 
	char *sarg[3]; 
	char buf1[4], buf2[4]; 
	char type[SIZE],old[SIZE],new[SIZE],n[SIZE]; 
	int pipes[2], i; 
	int c; 
	

	while(1) { 

	if(pipe(pipes) == -1) {
		perror("pipe failed");
		exit(1);
	}
	
	if(fork()) { 
		printf("'store' or 'read' or 'list' : \n");
		scanf("%s",type); 
		if(strcmp(type,"store")==0) { 
			c = 4; 
			scanf("%s %s %s", old,new,n); 
			arg[0]=type;
			arg[1]=old;
			arg[2]=new;
			arg[3]=n; 
		}
		else if(strcmp(type,"read")==0) { 
			c=3; 
			scanf("%s %s", old,new); 
			arg[0]=type;
			arg[1]=old;
			arg[2]=new;
		}
		else if(strcmp(type,"list")==0) { 
			c=1;
			arg[0]=type;
		}
		else 
			printf("wrong!!"); 
		
		
		for(i=0; i<c; i++) {  
		write(pipes[1], arg[i], SIZE);
		}
		
	    
   	}
	else { 
		
		read(pipes[0], type, SIZE); 
		if(strcmp(type,"store")==0) { 
			read(pipes[0], old, SIZE);
			fname[0]=old; 
			read(pipes[0], new, SIZE);
			sarg[0]=new; 
			create[0]=new;  
			read(pipes[0], n, SIZE);
			sarg[2]=n;
			int k = atoi(n); 

			FILE *fp, *meta;
			fp=fopen(old,"r"); 
			meta=fopen("metafile.txt", "a"); 

			fseek(fp,0,SEEK_END);
			int fsize=ftell(fp); 
			fclose(fp); 
			
			sprintf(buf2,"%d",fsize); 
			sarg[1]=buf2; 
			
			pt=fsize/k; 

			for(i=0; i<3; i++) { 
				fputs(sarg[i], meta);
				fputs("\t",meta);
			}
			fputs("\n",meta);
			fclose(meta);
			
			store(new,k); 
			
		}
		else if(strcmp(type,"read")==0) { 
			read(pipes[0], old, SIZE);
			read(pipes[0], new, SIZE);
			reader(old,new);	
		}
		else if(strcmp(type,"list")==0) { 
			FILE *list;
			list=fopen("metafile.txt","r"); 
			char s;
			if(list==NULL) printf("파일없음\n"); 
			else {
				while((s=fgetc(list))!=EOF)
					printf("%c",s);
			}
			
			fclose(list);
			
		}
		else
			printf("wrong!\n");
    		exit(0);
	}
	}
}
