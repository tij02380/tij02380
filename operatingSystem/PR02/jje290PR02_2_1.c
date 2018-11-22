#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include <time.h>
#include <wait.h>
#define QSIZE 50
#define NEXT(index) ((index+1)%QSIZE)

static long long num = 0;
int thread_args[2] = {1,2};
time_t timer;

int front;
int rear;
int buffer[QSIZE];

void timecounter() {
	struct tm* today;
	time(&timer);
	today=localtime(&timer);
	int ms;
	struct timespec spec;
	clock_gettime(CLOCK_REALTIME, &spec);
	ms=spec.tv_nsec / 1.0e6;
	printf("%d:%d:%d.%d",today->tm_hour,today->tm_min,today->tm_sec,ms);
}

int full() {
	return NEXT(rear)==front;
}
int empty() {
	return front==rear;
}
void enqueue(int itemPtr) {
	buffer[rear] = itemPtr;
	rear=NEXT(rear);
}
int dequeue() {
	int d;
	d = buffer[front];
	front=NEXT(front);
	return d;
}

void *ProducerThread(void *arg) {	
	int j,k;
	srandom((unsigned)time(NULL));
	while (num<100) {
		if (!full()) {
			num+=1;
			k=(random()%100)+1;
			usleep(100000);
			enqueue(k);
			printf("Producer #%d:",*(int *)arg);	
			timecounter();
			printf(" %d\n",k);
		}	
	}
	
}

void *ConsumerThread(void *arg) {
	int i;
	for(i=0;i<300;i++) {
		while (num<25) { }
		if(!empty()) {
			usleep(50000);
			int k = dequeue();
			printf("Consumer #%d:",*(int *)arg);
			timecounter();
			printf(" %d\n",k);
		}
	}	
}

void main () {
	front=rear=0;
	pthread_t threads[4];
	int i;
	for (i=0; i<4; i++) {
		if(i%2) pthread_create(&threads[i],NULL,ProducerThread,&thread_args[i/2]);
		else pthread_create(&threads[i],NULL,ConsumerThread,&thread_args[i/2]);
	}
	for (i=0; i<4; i++) pthread_join(threads[i], NULL);
}
