#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

struct node{
    int data;
    struct node* next;
};

void push(struct node **h,int val){
    struct node* n=(struct node*)malloc(sizeof(struct node));
    n->data=val;
    n->next=*h;
    *h=n;    
}

struct node* reverseRecursion(struct node *curr){
    struct node* first;
    struct node* second;
    first=curr;
    second=first->next;
    if(second==NULL){
        return first;
    }
    struct node* h=reverseRecursion(second);
    first->next=second->next;
    second->next=first;
    return h;
}

int main() {
    int k;
    struct node* l1=NULL;
    struct node* l2=NULL;
    for(int i=0;i<3;i++){
        scanf("%d",&k);
        push(&l1,k);        
    }
    for(int i=0;i<3;i++){
        scanf("%d",&k);
        push(&l2,k);        
    }
    struct node* res=NULL;
    struct node* curr1=l1;
    struct node* curr2=l2;
    while(curr1!=NULL&&curr2!=NULL){
        if(curr1->data>curr2->data){
            push(&res,curr1->data);
            curr1=curr1->next;
        }else{
            push(&res,curr2->data);
            curr2=curr2->next;
        }
    }
    while(curr1!=NULL){
        push(&res,curr1->data);
        curr1=curr1->next;
    }
    while(curr2!=NULL){
        push(&res,curr2->data);
        curr2=curr2->next;
    }
    res=reverseRecursion(res);
    struct node* rum=res;
    while(rum!=NULL){
        printf("%d ",rum->data);
        rum=rum->next;
    }
    return 0;
}

