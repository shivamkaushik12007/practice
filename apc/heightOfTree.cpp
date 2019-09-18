int height(tree* root){
	if(root==NULL)
		return 0;
	
	return 1+height(root->left)>height(root->right)?height(root->left):height(root->right);
}
