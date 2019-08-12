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

void halfAlternate(struct node **h){
	struct node* h2;
	struct node* curr=*h;
	struct node* curr1=*h;
	struct node* curr2=*h;
	int i=0;
	if(curr2==NULL||curr2->next==NULL||curr2->next->next==NULL)
		return;
		
	while(curr2!=NULL){
		curr2=curr2->next;
		i++;
	}
	i=i%2==0?i/2:(i/2)+1;
	for(int j=0;j<i-1;j++){
		curr1=curr1->next;
	}
	h2=curr1->next;
	curr1->next=NULL;
	curr2=h2;
	struct node* prev=NULL;
	struct node* next1;
	while(curr2!=NULL){
		next1=curr2->next;
		curr2->next=prev;
		prev=curr2;
		curr2=next1;
	}
	h2=prev;
	curr2=h2;
	while(curr2!=NULL){
		prev=curr2->next;
		curr2->next=curr->next;
		curr->next=curr2;
		curr2=prev;
		curr=curr->next->next;
	}
}

int main(){
	struct node* head=NULL;
	insertBeg(&head,10);
	insertBeg(&head,9);
	insertBeg(&head,8);
	insertBeg(&head,7);
	insertBeg(&head,6);
	insertBeg(&head,5);
	insertBeg(&head,4);
	insertBeg(&head,3);
	insertBeg(&head,2);
	insertBeg(&head,1);
	halfAlternate(&head);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
	
}
