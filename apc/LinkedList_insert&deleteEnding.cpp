#include <stdio.h> 
#include <stdlib.h>

struct node{
	int data;
	struct node* next;
}; 

void insertEnd(struct node **h,int val){
	struct node* n=(struct node*)malloc(sizeof(struct node));
	n->data=val;
	n->next=NULL;
	if(*h==NULL){
		*h=n;
	}else{
		struct node* curr=*h;
		while(curr->next!=NULL){
			curr=curr->next;
		}
		curr->next=n;
	}
}

void deleteEnd(struct node **h){
	struct node* curr=*h;
	while(curr&&curr->next&&curr->next->next){
		curr=curr->next;
	}
	struct node* temp=curr->next;
	if(curr==*h){
		*h=NULL;
	}else{
		curr->next=NULL;
	}
	free(temp);
	temp=NULL;
}

int main(){
	struct node* head=NULL;
	insertEnd(&head,10);
	deleteEnd(&head);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
}
