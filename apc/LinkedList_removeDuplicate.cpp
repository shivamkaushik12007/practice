void removeDuplicate(struct node **h){
	struct node* curr=*h;
	struct node* next=curr->next;
	
	while(next!=NULL){
		if(curr->data==next->data){
			curr->next=next->next;
			next->next=NULL;
			next=curr->next;
		}else if(next->data!=curr->data){
			curr->next=next;
			curr=next;
			next=next->next;
		}
			
	}
}
