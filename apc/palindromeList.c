#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

struct ListNode {
	int val;
	struct ListNode *next;
};

typedef struct ListNode listnode;

listnode* listnode_new(int val) {
	listnode* node = (listnode *) malloc(sizeof(listnode));
	node->val = val;
	node->next = NULL;
	return node;
}

void addNode(listnode* A, int i){
	listnode* temp = listnode_new(i);
	listnode* t = A;
	while(t->next != NULL){
		t = t->next;
	}
	t->next = temp;
}

/*
 * Complete the function below.
 */
   
listnode* reverseRecursion(listnode *curr){
    listnode* first;
    listnode* second;
    first=curr;
    second=first->next;
    if(second==NULL){
        return first;
    }
    listnode* h=reverseRecursion(second);
    first->next=second->next;
    second->next=first;
    return h;
}

int isPalin(listnode* A){
    listnode* head=(listnode*)malloc(sizeof(listnode));
    listnode* temp=A;
    while(temp!=NULL){
        addNode(head,temp->val);
        temp=temp->next;
    }
    head=reverseRecursion(head);
    listnode* temp1=A;
    listnode* temp2=head;
    while(temp1!=NULL){
        if(temp1->val!=temp2->val)
            return 0;
        temp1=temp1->next;
        temp2=temp2->next;
    }
    return 1;
}
int main(){
	int count = 0;
	int i;
	int v;
	scanf("%d",&count);
	scanf("%d",&v);
	listnode* A = listnode_new(v);
	for(i=0;i<count-1;i++){
		scanf("%d",&v);
		addNode(A,v);
	}
	if(isPalin(A) == 1) printf("true");
	else printf("false");
}
