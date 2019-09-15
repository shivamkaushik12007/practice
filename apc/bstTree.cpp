#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node* left;
	struct node* right;
};

void insert(struct node** h,int data){
	if(*h==NULL){
		struct node* n=(struct node*)malloc(sizeof(struct node));
		n->data=data;
		n->left=NULL;
		n->right=NULL;
		*h=n;
	}
	
	if((*h)->data>data) insert(&((*h)->left),data);
	if((*h)->data<data) insert(&((*h)->right),data);
			
}

int main(){
	struct node* head=NULL;
	insert(&head,2);
	insert(&head,3);
	insert(&head,1);
	printf("%d",head->data);
	printf("%d",head->left->data);
	printf("%d",head->right->data);
}
