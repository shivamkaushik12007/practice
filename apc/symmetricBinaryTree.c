int check(treenode* l,treenode* r){
    if(!l&&!r)
        return 1;
    if((l&&!r)||(!l&&r))
        return 0;
    if(l->val!=r->val)
        return 0;
    int m=check(l->left,r->right);
    int n=check(l->right,r->left);
    if((m==0&&n==1)||(n==0&&m==1))
        return 0;
    return 1;
 }
int isSymmetric(treenode* A) {
    int k=check(A->left,A->right);
    return k;
}
