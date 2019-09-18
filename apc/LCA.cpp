treenode* LCA(treenode* root,int a,int b){
	if(root == NULL)
		return NULL;
	
	if(root->key==a||b){
		return root;
	}
	
	treenode* x=LCA(root->left,a,b);
	treenode* y=LCA(root->right,a,b);
	
	if(x&&y){
		return root;
	}else if(x){
		return x;
	}else if(y){
		return y;
	}
	
	return NULL;
}
