#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    pid_t pid;
    pid=fork();
    if (pid<0) {
        printf("can't make fork! error!\n");
        exit(-1);
    }
    else if(pid==0) {
        printf("CHILD RUN\n");
        printf("CHILD_MY_PID = %d, PARENT_PID = %d\n", getpid(),getpid()-1);
        printf("\n");
        sleep(10);
        execl("/bin/ls", "ls","-al", NULL);
        exit(0);
    }
    else {
        printf("PARENT RUN\n");
        printf("PARENT_MY_PID = %d, CHILD_PID = %d\n", getpid(),pid);
        printf("\n");
        sleep(10);
        exit(0);
    }
    return 0;
}