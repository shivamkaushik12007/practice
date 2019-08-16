#include <stdio.h> 
#include <stdlib.h>

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

char pole(Stack **h){
	if(*h==NULL)
		return NULL;
	
	Stack* temp=*h;
	*h=(*h)->next;
	return temp->data;
}

char peak(Stack **h){
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
	head=push(head,'a');
	head=push(head,'a');
	pop(&head);
	cout<<peak(&head)<<endl;
	pop(&head);
	cout<<isEmpty(&head);
	return 0;
}
