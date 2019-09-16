int search(struct node** h,int s){	
	int n=0;
	
	if(*h==NULL)
		return -1;
	
	if((*h)->data==s){
		return 1;
	}
	if((*h)->data>s)  n=search(&((*h)->left),s);
	if((*h)->data<s)  n=search(&((*h)->right),s);
	
	return n;
 }
 
