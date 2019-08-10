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
struct node* swapAdjecentRecursion(struct node *h){
	struct node* first=h;
	struct node* second=first->next;
	if(first->next==NULL){
		return first;
	}
	second->next=second->next!=NULL?swapAdjecentRecursion(second->next):NULL;
	first->next=second->next;
	second->next=first;
	return second;
}
int main(){
	struct node* head=NULL;
	insertBeg(&head,90);
	insertBeg(&head,10);
	insertBeg(&head,20);
	insertBeg(&head,30);
	insertBeg(&head,40);
	insertBeg(&head,50);
	insertBeg(&head,60);
	insertBeg(&head,70);
	insertBeg(&head,80);
	head=swapAdjecentRecursion(head);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
	
}
