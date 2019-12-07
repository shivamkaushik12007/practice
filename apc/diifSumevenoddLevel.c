#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

// binary tree node
typedef struct Node
{
  int data;
  struct Node *left;
  struct Node *right;
} Node;

// return new node
Node *createNode (int data)
{
  Node *x = malloc(sizeof(Node));
  x->data = data;
  x->left = x->right = NULL;
}

// insert into tree
Node *insert (Node *x, int data)
{
  if (x == NULL)
    return createNode(data);
  
  if (data < x->data)
    x->left = insert(x->left, data);
  else if (data > x->data)
    x->right = insert(x->right, data);
  
  return x;
}

// Queue implementation
typedef struct
{
  Node *arr[100];
  int head, tail;
} Queue;

Queue queue = {.head = 0, .tail = 0};

// push to queue
void push(Node *x)
{
  queue.arr[queue.tail++] = x;
}

// pop
void pop(void)
{
  queue.head++;
}

// empty queue
bool is_empty(void)
{
  return queue.tail - queue.head == 0;
}

// peek
Node *peek(void)
{
  return queue.arr[queue.head];
}

// size of queue
int size(void)
{
  return queue.tail - queue.head;
}
int height(Node* root){
  if(root==NULL)
    return 0;
  return 1+(height(root->left)>height(root->right)?height(root->left):height(root->right)); 
}
typedef struct list{
  Node* val;
  struct list* next;
}list;
// struct qu{
//   list* start;
//   list* end;
// }
// void inQ(qu** h,int val){
//   (*h)->start=
// }
void insertlist(list** head,Node* val){
  list* n=(list*)malloc(sizeof(list));
  n->val=val;
  n->next=*head;
  *head=n;
}

Node* deletelist(list** head){
	if(*head==NULL)
      return NULL;
  if((*head)->next==NULL){
    Node* k=(*head)->val;
    *head=NULL;
    return k;
  }
  list* n=*head;
  while(n->next->next!=NULL){
    n=n->next;
  } 
  Node* m=n->next->val;
  n->next=NULL;
  return m;
}
// return diff of sum
int diff_sum (Node *root){
  int k=height(root);
  //Complete this function
  list* l1=NULL;
  list* l2=NULL;
  int odd=0,even=0;
  insertlist(&l1,root);
  for(int i=0;i<k;i++){
    while(l1!=NULL){
      Node* m=deletelist(&l1);
      if(m->left!=NULL){
        insertlist(&l2,m->left);
      }
      if(m->right!=NULL){
        insertlist(&l2,m->right);
      }
      odd+=m->data;
    }
    while(l2!=NULL){
      Node* m=deletelist(&l2);
      if(m->left!=NULL){
        insertlist(&l1,m->left);
      }
      if(m->right!=NULL){
        insertlist(&l1,m->right);
      }
      even+=m->data;
    }
   }
   return odd-even;
//   return -9;
}

// Main function
int main(void) 
{
  int nodes;
  scanf("%d", &nodes);
  
  Node *root = NULL;
  for (int i = 0; i < nodes; i++)
  {
    int n;
    scanf("%d", &n);
    root = insert(root, n);
  }
  
  printf("%d\n", diff_sum(root));
}

