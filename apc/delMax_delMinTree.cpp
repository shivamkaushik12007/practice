
void delMax(struct node** h){
	if(*h==NULL)
		return;
	if((*h)->right==NULL){
		*h=(*h)->left;
		return;
	}	
	if((*h)->right->right==NULL){
		(*h)->right=(*h)->right->left;
		return;	
	}
	delMax(&((*h)->right));
}

void delMin(struct node** h){
	if(*h==NULL)
		return;
	if((*h)->left==NULL){
		*h=(*h)->right;
		return;s
	}	
	if((*h)->left->left==NULL){
		(*h)->left=(*h)->left->right;
		return;	
	}
	delMin(&((*h)->left));
}

