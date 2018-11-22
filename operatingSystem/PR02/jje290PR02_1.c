#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h> 
#include <time.h>
#include <wait.h>

int NUM=100;
int number[100];
int thread_args[3] = {1,2,3};

void *Thread(void *arg) {
	FILE * p=fopen("result.txt","a");
	int num[NUM];
	int i,all;
	for(i=0; i<NUM; i++) num[i]=0;
	int j,k;
	srandom((unsigned)time(NULL)+(unsigned)getpid());

	for (j=0; j<100000; j++) {
		k=random()%NUM;
		number[k]=number[k]+1;
		num[k]=num[k]+1;
		usleep(1);
	}
	fprintf(p,"Thread %d >", *(int *)arg);
	for (j=0; j<NUM; j++) {
		fprintf(p,"[%d]:%d / ",j,num[j]);
		all=all+num[j];
	}
	fputs("\n",p);
	fprintf(p,"Thread %d frequency sum = %d", *(int *)arg, all);
	fputs("\n",p);
	fclose(p);
	pthread_exit(0);
}

void NUMBER () {
	FILE * p=fopen("result.txt","a");
	int j,all;
	fputs("number > ",p);
	for (j=0; j<NUM; j++) {
		fprintf(p,"[%d]:%d / ",j,number[j]);
		all=all+number[j];
	}
	fputs("\n",p);
	fprintf(p,"number frequency sum = %d", all);
	fputs("\n",p);
	fputs("----------------------------------------------------------------------------------------\n",p);
	fclose(p);
}

int main() {
	pid_t pid;
	pid = fork();
	int i;
	pthread_t threads[3];
	if(pid<0) {
		printf("can't make fork! error!\n");
		exit(-1);
	}
	else if(pid==0) {
		for(i=0; i<3; i++)
			pthread_create(&threads[i],NULL,Thread,&thread_args[i]);
		for(i=0; i<3; i++)
			pthread_join(threads[i],NULL);
		NUMBER();
		exit(0);
	}
	else {
		wait(NULL);
		for(i=0; i<3; i++)
			pthread_create(&threads[i],NULL,Thread,&thread_args[i]);
		for(i=0; i<3; i++)
			pthread_join(threads[i],NULL);
		NUMBER();
		exit(0);
	}	
	return 0;
}
