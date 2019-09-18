find(tree* root,element){
	if(root==NULL)
		return 0;
	if(root->key==element)
		return 1;
		
	return find(root->left)||find(root->right);
}
