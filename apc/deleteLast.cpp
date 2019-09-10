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

void deleteLast(struct node** h,int k){
	struct node* curr=*h;
	struct node* curr1=*h;
	int j=0;
	while(curr1->next!=NULL){
		if(curr1->next->data==k){
			curr=curr1;
			j++;
		}
		curr1=curr1->next;
	}
	if(j==0&&(*h)->data==k){
		*h=(*h)->next;
		return;
	}
	if(j>0)
		curr->next=curr->next->next;
}

int main(){
	struct node* l1=NULL;
	struct node* l2=NULL;
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		int k;
		scanf("%d",&k);
		insertBeg(&l1,k);
	}
	int k;
	scanf("%d",&k);
	
	deleteLast(&l1,k);
	
	struct node* curr=l1;
	while(curr!=NULL){
 		printf("%d",curr->data);
 		curr=curr->next;
	}
}
