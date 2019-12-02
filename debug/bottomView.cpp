#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct node{
    int val;
    int pos;
    struct node* left;
    struct node* right;
}tree;

tree* newTreeNode(int val,int pos){
    tree* n=(tree*)malloc(sizeof(tree));
    n->val=val;
    n->pos=pos;
    n->left=n->right=NULL;
    return n;
}

tree* insertTree(tree* root,int val,int pos){
    if(root==NULL)
        return newTreeNode(val,pos);
    if(root->val<val){
        root->right=insertTree(root->right,val,pos+1);
    }
    if(root->val>val){
        root->left=insertTree(root->left,val,pos-1);
    }
    return root;
}

typedef struct kode{
    tree* root;
    struct kode* next;
}map;

void insertMap(tree* root,map** node,int* arr){
        arr[root->pos+101]=root->val;
//     map* temp=*node;
//     if(temp==NULL||temp->root->pos>root->pos){
//         map* n=(map*)malloc(sizeof(map));
//         n->root=root;
//         n->next=temp;
//         *node=n;
//         return;
//     }
//     while(temp->next!=NULL&&(temp->next->root->pos)<(root->pos)){
//     //    printf("\n equal value is %d %d \n",temp->root->pos,root->pos);
//         if(temp->root->pos==root->pos){
//             temp->root->val=root->val;
//             return;
//         }
//         temp=temp->next;
//     }
//     map* n=(map*)malloc(sizeof(map));
//     n->root=root;
//     n->next=temp->next;
//     temp->next=n;
    
}

void insertBottom(tree* root,map** mp,int* arr){
    if(root==NULL)
        return;
    insertMap(root,mp,arr);
    insertBottom(root->left,mp,arr);
    insertBottom(root->right,mp,arr);
}

int main() {
    tree* root=NULL;
    map* mp=NULL;
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int temp;
        scanf("%d",&temp);
        root=insertTree(root,temp,0);
    }
    int* arr=(int*)malloc(sizeof(int)*201);
    for(int i=0;i<201;i++){
        arr[i]=-1;
    }
    insertBottom(root,&mp,arr);
    // map* temp=mp;
    // while(temp!=NULL){
    //     printf("%d ",temp->root->val);
    //     temp=temp->next;
    // }
    for(int i=0;i<201;i++){
        if(arr[i]!=-1){
            printf("%d ",arr[i]);
        }
    }
    return 0;
}






















#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct node{
    int val;
    int pos;
    struct node* left;
    struct node* right;
}tree;

tree* newTreeNode(int val,int pos){
    tree* n=(tree*)malloc(sizeof(tree));
    n->val=val;
    n->pos=pos;
    n->left=n->right=NULL;
    return n;
}

tree* insertTree(tree* root,int val,int pos){
    if(root==NULL)
        return newTreeNode(val,pos);
    if(root->val<val){
        root->right=insertTree(root->right,val,pos+1);
    }
    if(root->val>val){
        root->left=insertTree(root->left,val,pos-1);
    }
    return root;
}

typedef struct lad{
    tree* val;
    struct lad* next;
}queue;

void push(queue** head,tree* root){
    queue* n=(queue*)malloc(sizeof(queue));
    n->val=root;
    n->next=NULL;
    if(*head==NULL){
        *head=n;
        return;
    }
    queue* temp=*head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}

queue* pop(queue** head){
    if(*head==NULL)
        return;
    queue* temp=*head;
    *(head)=temp->next;
    return temp;
}

bool isEmpty(queue** node){
    if(node==NULL)
        return true;
    return false;
}

// typedef struct kode{
//     tree* root;
//     struct kode* next;
// }map;

// void insertMap(tree* root,map** node,int* arr){
//         arr[root->pos+101]=root->val;
// //     map* temp=*node;
// //     if(temp==NULL||temp->root->pos>root->pos){
// //         map* n=(map*)malloc(sizeof(map));
// //         n->root=root;
// //         n->next=temp;
// //         *node=n;
// //         return;
// //     }
// //     while(temp->next!=NULL&&(temp->next->root->pos)<(root->pos)){
// //     //    printf("\n equal value is %d %d \n",temp->root->pos,root->pos);
// //         if(temp->root->pos==root->pos){
// //             temp->root->val=root->val;
// //             return;
// //         }
// //         temp=temp->next;
// //     }
// //     map* n=(map*)malloc(sizeof(map));
// //     n->root=root;
// //     n->next=temp->next;
// //     temp->next=n;
    
// }



void insertMap(tree* root,int* arr){
        arr[root->pos+101]=root->val;   
}

void insertBottom(tree* root,int* arr){
    queue* head=NULL;
    push(&head,root);
    while(!isEmpty(&head)){
        queue* temp=pop(&head);
        insertMap(temp->val,arr);
        if(temp->val->left)
            push(&head,temp->val->left);
        if(temp->val->right)
            push(&head,temp->val->right);
    }
    // if(root==NULL)
    //     return;
    // insertMap(root,mp,arr);
    // insertBottom(root->left,mp,arr);
    // insertBottom(root->right,mp,arr);
}

int main() {
    tree* root=NULL;
    // map* mp=NULL;
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int temp;
        scanf("%d",&temp);
        root=insertTree(root,temp,0);
    }
    int* arr=(int*)malloc(sizeof(int)*201);
    for(int i=0;i<201;i++){
        arr[i]=-1;
    }
    insertBottom(root,arr);
    // map* temp=mp;
    // while(temp!=NULL){
    //     printf("%d ",temp->root->val);
    //     temp=temp->next;
    // }
    for(int i=0;i<201;i++){
        if(arr[i]!=-1){
            printf("%d ",arr[i]);
        }
    }
    return 0;
}
