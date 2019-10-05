#include<stdio.h>

//tree structure with size variable in it
struct node{
	int key;
	struct node* left;
	struct node* right;
	int n;
};

//to create the new node
node* newNode(int key){
	struct node* n=(struct node)malloc(sizeof(struct node));
	n->key=key;
	n->left=n->right=NULL;
	n->n=1;
}

//to return the size of the next node required without traversing
int size(node* h){
	int k=h==NULL?0:h->n;
	return k;
}

//to insert the value in tree with the node size/subtree size
node* insert(node* h,int key){
	if(h==NULL) return newNode(key);
	
	if(h->key>key){
		h->left=insert(h->left,key);
	}else if(h->key<key){
		h->right=insert(h->right,key);
	}
	
	h->n=1+size(h->left)+size(h->right);
}

//to return the rank value
int rank(struct node* root,int key){
	return getRank(root,key);
}

//to find the rank value
int getRank(node* root,int key){
	if(root==NULL) return -1;
	
	if(root->key==key) return size(root->left);
	
	if(root->key>key){
		return getRank(root->left,key);
	}
	
	return 1+size(root->left)+getRank(root->right,k);
}

