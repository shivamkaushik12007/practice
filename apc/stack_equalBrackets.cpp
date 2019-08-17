#include <stdio.h> 
#include <stdlib.h>
#include<iostream>
using namespace std;


typedef struct stack{
	char data;
	struct stack* next;
}Stack; 


Stack* push(Stack *h,char val){
	Stack* n=(Stack*)malloc(sizeof(Stack));
	n->data=val;
	n->next=h;
	return n;
}

void pop(Stack **h){
	if(*h==NULL){
		return;
	}else{
		Stack* temp=*h;
		*h=(*h)->next;
		free(temp);
		temp=NULL;
	}
}

char peek(Stack **h){
	Stack* curr=*h;
	return curr->data;
}

bool isEmpty(Stack **h){
	if(*h==NULL)
		return true;
		
	return false;
} 

int main(){
	Stack* head=NULL;
	int n;
	cin>>n;
	char ch[n];
	for(int i=0;i<n;i++){
		cin>>ch[i];
	}
	for(int i=0;i<n;i++){
		if(ch[i]=='('||ch[i]=='{'||ch[i]=='['||ch[i]=='<'){
			head=push(head,ch[i]);
		}
		if((ch[i]==')'&&peek(&head)=='(')||(ch[i]=='}'&&peek(&head)=='{')||(ch[i]==']'&&peek(&head)=='[')){
			pop(&head);
		}
	}
	if(isEmpty(&head)){
		cout<<"true";
	}else{
		cout<<"false";
	}
	return 0;
}
