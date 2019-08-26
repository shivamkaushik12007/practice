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
void swap(struct node *a, struct node *b) 
{ 
    int temp = a->data; 
    a->data = b->data; 
    b->data = temp; 
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
    while(curr1->next!=NULL){
        curr1=curr1->next;
    }
    curr1->next=curr2;
    l2=NULL;
    int swapped;
    struct node* ptr1;
    struct node* lptr=NULL;
    do
    { 
        swapped = 0; 
        ptr1 = l1; 
  
        while (ptr1->next != lptr) 
        { 
            if (ptr1->data < ptr1->next->data) 
            {  
                swap(ptr1, ptr1->next); 
                swapped = 1; 
            } 
            ptr1 = ptr1->next; 
        } 
        lptr = ptr1; 
    } 
    while (swapped); 
    struct node* rum=l1;
    while(rum!=NULL){
        printf("%d ",rum->data);
        rum=rum->next;
    }
    return 0;
}

