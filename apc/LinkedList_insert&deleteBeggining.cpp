#include <stdio.h> 
#include <stdlib.h>

struct node{
	int data;
	struct node* next;
}; 


void insertBeg(struct node **h,int val){
	struct node* n=(struct node*)malloc(sizeof(struct node));
	n->data=val;
	n->next=*h;
	*h=n;
}

void deleteBeg(struct node **h){
	if(*h==NULL){
		return;
	}else{
		struct node* temp=*h;
		*h=(*h)->next;
		free(temp);
		temp=NULL;
	}
}

int main(){
	struct node* head=NULL;
	insertBeg(&head,10);
	deleteBeg(&head);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
}
