#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

typedef struct node{
    int val;
    struct node* left;
    struct node* right;
}tree;

tree* newNode(int val){
    tree* n=(tree*)malloc(sizeof(tree));
    n->val=val;
    n->left=n->right=NULL;
    return n;
}

tree* insert(tree* root,int val){
    if(root==NULL)
        return newNode(val);
    if(root->val<val){
        root->right=insert(root->right,val);
    }
    if(root->val>val){
        root->left=insert(root->left,val);
    }
    return root;
}

int checkAnc(tree* root,int l1,int l2){
    if(root==NULL)
        return -1;
    if(root->val==l1||root->val==l2){
        return root->val;
    }
    int x=checkAnc(root->left,l1,l2);
    int y=checkAnc(root->right,l1,l2);
    if(x==-1&&y==-1)
        return -1;
    if(x!=-1&&y!=-1)
        return root->val;
    
    if(x>=1&&y==-1)
        return x;
    if(y>=1&&x==-1)
        return y;
    return 0;
}

tree* find(tree* root,int l){
    if(root==NULL)
        return NULL;
    if(root->val==l)
        return root;
    if(root->val<l)
        return find(root->right,l);
    if(root->val>l)
        return find(root->left,l);
    return NULL;      
}

bool pChild(tree* root,int l1,int l2){
    tree* temp=find(root,l1);
    tree* kemp=find(temp,l2);
    if(kemp==NULL)
        return false;
    return true;
}

int parent(tree* root,int l){
    tree* temp=root;
    if(root->left->val==l||root->right->val==l)
        return root->val;
    int x,y;
    if(root->val>l){
        x=parent(root->left,l);
        return x;
    }
    if(root->val<l)
        y=parent(root->right,l);
    return y;
}

int main() {
    int n;
    tree* root=NULL;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int temp;
        scanf("%d",&temp);
        root=insert(root,temp);
    }
    int k;
    scanf("%d",&k);
    for(int i=0;i<k;i++){
        int l1,l2;
        scanf("%d %d",&l1,&l2);
        int res=-1;
        if(root->val!=l1&&root->val!=l2){
            if(pChild(root,l1,l2)){
                res=parent(root,l1);
            }else if(pChild(root,l2,l1)){
                res=parent(root,l2);
            }else{
                res=checkAnc(root,l1,l2);
            }
        }
        printf("%d\n",res);
    }
    return 0;
}
