#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct node{
    int val;
    struct node* next;
}stack;

void push(stack** head,int val){
    stack* n=(stack*)malloc(sizeof(stack));
    n->val=val;
    n->next=*head;
    *head=n;
}

void pop(stack** head){
    *head=(*head)->next;
}

int peek(stack* head){
    return head->val;
}

int main() {
    int n;
    scanf("%d",&n);
    while(n!=0){
        int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
        stack* s1=NULL;
        int count=1,i=0;
        while(count<=n&&i<n){
            if(arr[i]!=count&&(s1==NULL||peek(s1)!=count)){
                // printf("pushing %d",arr[i]);
                push(&s1,arr[i]);
                i++;
                continue;
            }else if(arr[i]==count){
                // printf("adding %d",arr[i]);
                count++;
                i++;
                continue;
            }else if(s1!=NULL&&peek(s1)==count){
                // printf("poping %d",peek(s1));
                pop(&s1);
                count++;
                continue;
            }
            // if(peek(s1)!=count&&i>=n){
            //     break;
            // }
        }
         int k=0;
             while(s1!=NULL){
                  if(peek(s1)!=count){
                      k++;
                     break;
                  }
                  count++;
                  pop(&s1);
             }
        if(k==0){
            printf("yes\n");
        }else{
            printf("no\n");
        }
        int n1;
        scanf("%d",&n1);
        if(n1==0)
            break;
        n=n1;
    }
    return 0;
}
