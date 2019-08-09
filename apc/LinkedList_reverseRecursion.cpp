struct node* reverseRecursion(struct node *curr){
	struct node* first;
	struct node* second;
	first=curr;
	second=first->next;
	if(second==NULL){
		return first;
	}
	struct node* h=reverseRecursion(second);
	first->next=second->next;
	second->next=first;
	return h;
}

