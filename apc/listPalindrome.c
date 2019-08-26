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
    listnode* B=A;
    B=reverseRecursion(B);
    listnode* curr=A;
    listnode* curr1=B;
    int j=0;
    while(curr!=NULL){
        if(curr->val!=curr1->val){
            j++;
            break;
        }
        curr=curr->next;
        curr1=curr1->next;
    }
    if(j==1)
        return 0;

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
