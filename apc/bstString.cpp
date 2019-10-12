#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include<string>
using namespace std;
struct node{
	string data;
	struct node* left;
	struct node* right;
};

struct node *newNode(string item) 
{ 
    struct node *temp =  (struct node *)malloc(sizeof(struct node)); 
    temp->data = item; 
    temp->left = temp->right = NULL; 
    return temp; 
} 

struct node* insert(struct node* h,string data){
		if(h==NULL){
			return newNode(data);
		}
		
		if(h->data > data)
			h->left=insert(h->left,data);
		if(h->data < data) 
			h->right=insert(h->right,data);
			
		return h;
}

int main(){
	struct node* head=NULL;
	
	for(int i=0;i<5;i++){
	string str;
	getline (cin, str);
 	head=insert(head,str);	
	}
//	printf("%d",head->data);
cout<<head->data;
}
