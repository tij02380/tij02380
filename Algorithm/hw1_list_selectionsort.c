#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/////////////////////////////////////////////
struct NODE {
  int val;
  struct NODE *next;
};


/////////////////////////////////////////////
// List SELECTION SORT
struct NODE* selectionsort_list(struct NODE *head)
{
  struct NODE *min, *start, *first, *last, *pre, *temp;

  first=last=NULL;

  while(head){
	  min=head;
	  start=head->next;
	  pre=temp=NULL;

	  // find minimum value in unsorted list
	  while(start){
		  if(start->val < min->val){
			  min=start;
			  pre=temp;
		  }
		  temp=start;
		  start=start->next;
	  }

	  // change head and min node
	  temp=head->next;
	  head->next=min->next;
	  min->next=NULL;
	  if(pre) pre->next=head;

	  // sorted list
	  if(!first) first=last=min;
	  else{
	  	last->next=min;
	  	last=min;
	  }

	  if(temp != min) head=temp;
  }

  return first;
}