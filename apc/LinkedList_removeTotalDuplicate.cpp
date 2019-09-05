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

void removeDup(struct node** h){
	struct node* dummy=(struct node*)malloc(sizeof(struct node));
	struct node* ptr1=*h;
	struct node* ptr2=ptr1->next;
	if(ptr1==NULL||ptr2==NULL)
		return;
	
	dummy->next=*h;
	ptr1=dummy;
	ptr2=dummy->next;
	while(ptr2->next!=NULL){
		
		if(ptr1->next->data==ptr2->next->data){
			ptr2=ptr2->next;
		}else if(ptr1->next->data!=ptr2->next->data&&ptr1->next!=ptr2){
			ptr1->next=ptr2->next;
			ptr2=ptr2->next;
		}else if(ptr1->next->data!=ptr2->next->data&&ptr1->next==ptr2){
			ptr1=ptr1->next;
			ptr2=ptr2->next;
		}
		
	}
	if(ptr2->next==NULL&&ptr1->next->data==ptr2->data&&ptr1->next!=ptr2){
		ptr1->next=NULL;
	} 
	*h=dummy->next;
}

int main(){
	struct node* head=NULL;
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		int k;
		scanf("%d",&k);
		insertBeg(&head,k);	
	}
	removeDup(&head);
	struct node* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->data);
		curr=curr->next;
	}	
	return 0;
	
}
