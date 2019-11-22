int minDepth(treenode* A) {
    if(A==NULL)
        return 0;
    int x=minDepth(A->left);
    int y=minDepth(A->right);
    if(x==0&&y==0){
        return 1;
    }
    if(x==0&&y!=0)
        return 1+y;
    if(y==0&&x!=0)
        return 1+x;
    return 1+x<y?x:y;
}
