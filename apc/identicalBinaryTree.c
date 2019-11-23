int isSameTree(treenode* A, treenode* B) {
    if(A==NULL&&B==NULL)
        return 1;
    if((B==NULL)||(A==NULL)||(A->val!=B->val))
        return 0;
    int x=isSameTree(A->left,B->left);
    int y=isSameTree(A->right,B->right);
    if(x==1&&y==1)
        return 1;
    return 0;
}
