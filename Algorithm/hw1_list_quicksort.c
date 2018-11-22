
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/////////////////////////////////////////////
struct DNODE {
  int val;
  struct DNODE *prev, *next;
};


/////////////////////////////////////////////
// List QUICK SORT
// You may define other functions if necessary

struct DNODE *quicksort_list(struct DNODE *head)
{
  struct DNODE *pivot, *left, *right, *temp, *start; 
  pivot=left=head;
  right=temp=NULL;

  if(pivot->next){
	  start=pivot->next;
	  while(start){
		  temp=start->next;
		  // moving left of pivot if smaller than pivot
		  if(start->val < pivot->val){
			  left->prev=start;
			  start->prev->next=temp;
			  if(temp) temp->prev=start->prev;
			  start->prev=NULL;
			  start->next=left;
			  left=start;
		  }
		  start=temp;
	  }
	  if(left==pivot) left=NULL;

	  // partition (3 parts: left, pivot, right)
	  if(left){
		  pivot->prev->next=NULL;
		  pivot->prev=NULL;
		  left=quicksort_list(left);
	  }
	  if(pivot->next) {
		  right=pivot->next;
		  right->prev=NULL;
		  pivot->next=NULL;
		  right=quicksort_list(right);
	  }

	  // connection (left-pivot-right)
	  if(left){
		  left->prev->next=pivot;
		  pivot->prev=left->prev->next;
	  }
	  else
		  left=pivot;

	  if(right){
		  left->prev=right->prev;
		  right->prev=pivot;
		  pivot->next=right;		  
	  }
	  else left->prev=pivot;
  }
  else left->prev=left;

  return left;
}
