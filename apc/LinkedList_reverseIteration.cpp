
void reverseIteration(struct node **h){
	struct node* curr=*h;
	struct node* prev=NULL;
	struct node* next1;
	while(curr!=NULL){
		next1=curr->next;
		curr->next=prev;
		prev=curr;
		curr=next1;
	}
	*h=prev;
}

