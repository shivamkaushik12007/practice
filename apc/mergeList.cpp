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

struct node* mergeList(struct node** l1,struct node** l2){
	struct node* final=NULL;
	struct node* dumy=(struct node*)malloc(sizeof(struct node));	
	struct node* curr=dumy;
	struct node* curr1=*l1;
	struct node* curr2=*l2;
	
	while(curr1!=NULL&&curr2!=NULL){
		if(curr1->data<curr2->data){
			curr->next=curr1;
			curr1=curr1->next;
		}else{
			curr->next=curr2;
			curr2=curr2->next;
		}
		curr=curr->next;
	}
	if(curr2!=NULL){
		curr->next=curr2;
	}
	if(curr1!=NULL){
		curr->next=curr1;
	}
	final=dumy->next;
	return final;
}

int main(){
	struct node* list1=NULL;
	struct node* list2=NULL;
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		int k;
		scanf("%d",&k);
		insertBeg(&list1,k);
	}
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		int k;
		scanf("%d",&k);
		insertBeg(&list2,k);
	}
	
	struct node* final=mergeList(&list1,&list2);
	
	struct node* curr=final;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}
}
