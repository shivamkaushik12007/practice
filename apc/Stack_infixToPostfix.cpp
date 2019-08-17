#include <stdio.h> 
#include <stdlib.h>
#include<iostream>
using namespace std;

typedef struct stack{
	char data;
	struct stack* next;
}Stack; 


void push(Stack **h,char val){
	Stack* n=(Stack*)malloc(sizeof(Stack));
	n->data=val;
	n->next=*h;
	*h=n;
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
	if(*h==NULL)
		return NULL;
	Stack* curr=*h;
	return curr->data;
}

bool isEmpty(Stack **h){
	if(*h==NULL)
		return true;
		
	return false;
} 

int pres(char r){
	if(r=='(')
		return 0;
		
	if(r=='-')
		return 1;
		
	if(r=='+')
		return 2;
		
	if(r=='*'||r=='/')
		return 4;
		
	if(r=='^')
		return 5;
}
int main(){
	Stack* head=NULL;
	int n;
	cin>>n;
	char ch[n];
	for(int i=0;i<n;i++){
		cin>>ch[i];
	}
	char res[n];
	int j=0;
	for(int i=0;i<n;i++){
		if(ch[i]>='a'&&ch[i]<='z'){
			res[j]=ch[i];
			j++;
		}else if(ch[i]=='('){
			push(&head,ch[i]);
		}else if(ch[i]==')'){
			while(peek(&head)!='('){
				res[j]=peek(&head);
				j++;
				pop(&head);
			}
			pop(&head);
		}else{
			if(pres(ch[i])<=pres(peek(&head))){
				while(pres(ch[i])<=pres(peek(&head))){
					res[j]=peek(&head);
					j++;
					pop(&head);
				}
				push(&head,ch[i]);
			}else{
				push(&head,ch[i]);
			}
		}
	}
	if(!isEmpty(&head)){
		res[j]=peek(&head);
		j++;
		pop(&head);
	}
	for(int i=0;i<j;i++){
		cout<<res[i];
	}
	return 0;
}
