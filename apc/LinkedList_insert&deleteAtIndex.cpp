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


void insertIndex(struct node **h,int val,int ind){
	int j=0;
		struct node* curr1=*h;
		while(curr1->next!=NULL){
			curr1=curr1->next;
			j++;
		}
	if(ind>j){
		printf("the index is not present");
	}else{
		int i=0;
		struct node* curr=*h;
		if(ind==0){
			insertBeg(h,val);
		}else{	
			while(i<ind-1){
				curr=curr->next;
				i++;
			}
			struct node* n=(struct node*)malloc(sizeof(struct node));
			n->data=val;
			n->next=curr->next;
			curr->next=n;	
		}
	}
}

void deleteIndex(struct node **h,int ind){
	int j=0;
		struct node* curr1=*h;
		while(curr1->next!=NULL){
			curr1=curr1->next;
			j++;
		}
	if(ind>j){
		printf("the index is not present");
	}else{
		int i=0;
		struct node* curr=*h;
		if(ind==0){
			deleteBeg(h);
		}else{	
			while(i<ind-1){
				curr=curr->next;
				i++;
			}
			struct node* temp=curr->next;
		curr->next=temp->next;
		free(temp);
		temp=NULL;
		}
	}
}


int main(){
	struct node* head=NULL;
	insertIndex(&head,10,1);
	deleteIndex(&head,2);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
}
