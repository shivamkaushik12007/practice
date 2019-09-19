typedef struct Tree{
	int data;
	struct Tree* left;
	struct Tree* right;
}tree;

tree* insertTree(tree* root,int k){
	if(root==NULL){
		tree* n=(tree*)malloc(sizeof(tree));
		root->data=k;
		root->left=root->right=NULL;
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

//pushing the value 
void push(queue* q,tree* k,int dist){
	//special tree node
	stree* nn=(stree*)malloc(sizeof(stree));
	nn->node=k;
	nn->dis=dist;
	pushQ(q,nn);
}

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
	link* n=(link*)malloc(sizeof(link));
	n->m=val;
	n->next=*h;
	*h=n;
}

void pushLinkEnd(link** h,map* val){
	
}
int main(){
		
	return 0;
}
