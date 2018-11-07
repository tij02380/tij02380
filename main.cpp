#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <wait.h>
#include <time.h>

int main() { 
    int i;
    FILE *in;
    in=fopen("out_1.txt","w");
    for(i=0;i<10;i++) {
        pid_t pid;
        pid=fork();        
        
        if (pid<0) {
            printf("can't make fork! error!\n");
            exit(-1);
        }
        else if(pid==0) {
            int j;
            for(j=0;j<100;j++) {
                time_t timer;
                struct tm* today;
                time(&timer);
                today=localtime(&timer);
                long long ms; 
                struct timespec spec;
                clock_gettime(CLOCK_REALTIME, &spec);
                ms=spec.tv_nsec / 1.0e6;
                
                fprintf(in,"[Process %d #%d, PID(%d)] current time :  %4dy, %2dm, %2dd, %2dh, %2dm, %2ds, %dmilli \n",i+1,j,getpid()
					,today->tm_year+1900,today->tm_mon+1,today->tm_mday,today->tm_hour,today->tm_min,today->tm_sec,ms );
                usleep(1000);
                
            }
            exit(0);
        }
        else {
            printf("Parent PID : %d \n",getpid());
            wait(NULL);
            printf("Child has finished : PID[%d]\n",pid);
        }
    }
    fclose(in);
    return 0;
}
