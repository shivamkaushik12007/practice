 int height(treenode* tree){
    if(tree==NULL){
        return 0;
    }
    return 1+height(tree->left)>height(tree->right)?height(tree->left):height(tree->right);
 }
int isBalanced(treenode* A) {
    if(A==NULL)
        return 1;
    int x=height(A->left);
    int y=height(A->right);
    if(x-y>1||x-y<-1)
        return 0;
    int z=isBalanced(A->left);
    int za=isBalanced(A->right);
    if(z==1&&za==1)
        return 1;
    return 0;
}
