void inorder(treenode* A){
    if(A==NULL)
    	return;
    
	inorder(A->left);
    printf("%d ",A->val);
    inorder(A->right);
}

void preorder(treenode* A){
    if(A==NULL)
    	return;
    
    printf("%d ",A->val);
	preorder(A->left);
    preorder(A->right);
}

void postorder(treenode* A){
    if(A==NULL)
    	return;
    
	postorder(A->left);
    postorder(A->right);
    printf("%d ",A->val);
}

