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

void deleteNafterM(struct node** h,int k1,int k2){
	struct node* curr=*h;
	int m=1;
	while(curr!=NULL){
		
		if(m==k1){
			struct node* curr1=curr->next;
			int n=1;
			if(curr1==NULL){
				break;
			}
			while(curr1!=NULL&&n!=k2){
				n++;
				curr1=curr1->next;
			}
			curr->next=curr1->next;
			m=0;
		}
		m++;
		curr=curr->next;
	}
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
	int k1,k2;
	scanf("%d",&k1);
	scanf("%d",&k2);
	deleteNafterM(&l1,k1,k2);
	
	struct node* curr=l1;
	while(curr!=NULL){
 		printf("%d",curr->data);
 		curr=curr->next;
	}
}
