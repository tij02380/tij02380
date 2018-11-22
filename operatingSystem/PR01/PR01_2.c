#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void ParentProcess() {
    int i;
    for(i = 0; i <= 200; i++) {
		printf("This line is from parent, Parent_PID = %d, value = %d\n", getpid(),i);
	}
}
void ChildProcess() {
    int i;
    for(i = 0; i <= 200; i++) {
	printf("\tThis line is from child, Child_PID = %d, value = %d\n", getpid(),i);
	}
}

int main() {
    pid_t pid;
    pid=fork();
    if (pid<0) {
        printf("can't make fork! error!\n");
        exit(-1);
    }
    else if(pid==0) {
        ChildProcess();
		exit(0);
    }
    else {
        ParentProcess();
		exit(0);
    }
    return 0;
}