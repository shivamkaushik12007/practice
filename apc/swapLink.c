#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
struct node
{
    int data;
    struct node *next;
};
void swapNodes(struct node **head_ref, int x, int y){
    struct node* temp1=*head_ref;
    struct node* temp2=*head_ref;
    // printf("%d",temp1->next->data);
    // if(temp1->data==x){
    //     temp1=temp1->next;
    // }
    // if((*head_ref)->data==y){
    //     temp2=*head_ref;
    // }
    while(temp1->data!=x){
        temp1=temp1->next;
    }
    while(temp2->data!=y){
        temp2=temp2->next;
    }
    temp1->data=y;
    temp2->data=x;
}

void printList(struct node *node){
    while(node!=NULL){
        printf("%d\n",node->data);
        node=node->next;
    }
    // printf("%d",node->data);
}

void create(struct node** head,int v){
    struct node* n=(struct node*)malloc(sizeof(struct node));
    n->data=v;
    n->next=NULL;
    if((*head)==NULL){
        *head=n;
        return;
    }
    struct node* temp=*head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}

int main() {
    struct node* head=NULL;
    for(int i=0;i<5;i++){
        int n;
        scanf("%d",&n);
        create(&head,n);
    }
    int k1,k2;
    scanf("%d %d",&k1,&k2);
    swapNodes(&head,k1,k2);
    printList(head);
    return 0;
