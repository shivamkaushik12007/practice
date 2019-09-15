int minVal(struct node** h){
	if(*h==NULL)
		return INT_MIN;
	if((*h)->left==NULL){
		return (*h)->data;
	}	
	int n=minVal(&((*h)->left));
	return n;
}

int maxVal(struct node** h){
	if(*h==NULL)
		return INT_MAX;
	if((*h)->right==NULL){
		return (*h)->data;
	}	
	int n=maxVal(&((*h)->right));
	return n;
}

