#include<stdio.h>
#include<stdlib.h>

typedef struct Tree{
	int data;
	struct Tree* left;
	struct Tree* right;
}tree;

tree* insertTree(tree* root,int k){
	if(root==NULL){
		tree* n=(tree*)malloc(sizeof(tree));
		n->data=k;
		n->left=NULL;
		n->right=NULL;
		return n;
	}
	if(root->data>k){
		root->left=insertTree(root->left,k);
	}else{
		root->right=insertTree(root->right,k);
	}
	return root;
}

typedef struct sTree{
	tree* node;
	int dis;
}stree;

typedef struct Node{
	stree* snode;
	struct Node* next;
}node;

typedef struct Queue{
	node* front;
	node* rear;
}queue;

//adjusting in it queue
void pushQ(queue* q,stree* nn){
	
	//node of the linked list(queue)
	node* n=(node*)malloc(sizeof(node));
	n->snode=nn;
	n->next=NULL;
	
	//adding the value in queue(pointer)
	if(q->rear==NULL){
		q->front=n;
		q->rear=n;
	}else{
		q->rear->next=n;
		q->rear=n;
	}
	
}

//pushing the value 
void push(queue* q,tree* k,int dist){
	//special tree node
	stree* nn=(stree*)malloc(sizeof(stree));
	nn->node=k;
	nn->dis=dist;
	pushQ(q,nn);
}

void pop(queue* q){
	if(q->front==NULL)
		return;
	
	if(q->front==q->rear){
		q->front=q->rear=NULL;
		return;	
	}
	
	q->front=q->front->next;
}
typedef struct Map{
	int key;
	int value;
}map;

typedef struct Linked{
	map* m;
	struct Linked* next;
}link;

void pushLinkBeg(link** h,map* val){
	link* curr=(*h);
	
	if(curr!=NULL&&curr->m->key<=val->key){
		return;
	}else{
		link* n=(link*)malloc(sizeof(link));
		n->m=val;
		n->next=(*h);
		(*h)=n;
	}
}

void pushLinkEnd(link** h,map* val){
	link* curr=(*h);
	while(curr->next!=NULL){
		if(curr->m->key==val->key){
			return;
		}
		curr=curr->next;
	}	
	link* n=(link*)malloc(sizeof(link));
	n->m=val;
	n->next=NULL; 
	curr->next=n;
}

int main(){
	tree* root=NULL;
	root=insertTree(root,50);
	root=insertTree(root,30);
	root=insertTree(root,20);
	root=insertTree(root,40);
//	root=insertTree(root,70);
	root=insertTree(root,60);
//	root=insertTree(root,80);
	queue* q=(queue*)malloc(sizeof(queue));
	q->front=NULL;
	q->rear=NULL;
	link* head=NULL;
	push(q,root,0);
	while(q->front!=NULL){
		map* k=(map*)malloc(sizeof(map));
		k->key=q->front->snode->dis;
		k->value=q->front->snode->node->data;
//		printf("%d %d\n",k->value,k->key);
		if(k->key<=0){
			pushLinkBeg(&head,k);
		}else{
			pushLinkEnd(&head,k);
		}
		int dist=q->front->snode->dis;
		if(q->front->snode->node->left!=NULL){
			int dist1=dist-1;
			push(q,q->front->snode->node->left,dist1);
		}
		if(q->front->snode->node->right!=NULL){
			int dist1=dist+1;
			push(q,q->front->snode->node->right,dist1);
		}
//		printf("%d %d\n",q->front->snode->node->data,q->front->snode->dis);
		pop(q);
	}		
	link* curr=head;
	while(curr!=NULL){
		printf("%d ",curr->m->value);
		curr=curr->next;
	}
	return 0;
}
