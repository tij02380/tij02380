#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main() {
    pid_t pid;
    pid=fork();
    int count=-1;
    if (pid<0) { 
        printf("can't make fork! error!\n");
        exit(-1);
    }
    else if(pid==0) {
        int i;
	 for(i = 0; i <= 200; i++) {
		count++; 
		printf("This line is form pid %d, value = %d\n", getpid(),count); 
	 }
	 exit(0);
    }
    else { 
        int i;
        for(i = 0; i <= 200; i++) {
		count++;
		printf("This line is form pid %d, value = %d\n", getpid(),count);
	 }
	 exit(0);
    }    
    return 0;
}