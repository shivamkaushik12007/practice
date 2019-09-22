tree* floor(tree* n,int key){
	if(n==NULL)
		return NULL;
	if(n->key==key)
		return n;
	if(n->key>key)
		return floor(n->left,key);
	
}

int main(){
	
	tree* t=floor(root,key);
	printf(t==NULL?NULL:n->key);
}
