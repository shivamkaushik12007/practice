void swapAdjecentItteration(struct node **h){
		if (*h == NULL || (*h)->next == NULL)
		return;
	struct node* s=*h;
	struct node* temp=s->next;
	s->next=temp->next;
	temp->next=s;
	*h=temp;
	if(s->next==NULL||s->next->next==NULL){
		return;
	}
	struct node* prev=s;
	struct node* curr=s->next;
	struct node* next1=curr->next;
	while(true){
		prev->next=curr->next;
		curr->next=next1->next;
		next1->next=curr;
		if(curr->next==NULL||curr->next->next==NULL)
			break;
		prev=curr;
		curr=curr->next;
		next1=curr->next;		
	}	
}
