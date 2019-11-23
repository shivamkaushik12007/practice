int check(treenode* root,int k){
    if(root==NULL)
        return 0;
    if(root->val==k)
        return 1;
  
        return check(root->left,k)||check(root->right,k);
}

treenode* common(treenode* root,int a,int b){
    if(root == NULL)
        return NULL;
    
    if(root->val==a||root->val==b){
        return root;
    }
    
    treenode* x=common(root->left,a,b);
    treenode* y=common(root->right,a,b);
    
    if(x!=NULL&&y!=NULL){
        return root;
    }else if(x!=NULL){
        return x;
    }else if(y!=NULL){
        return y;
    }
    
    return NULL;
}

int lca(treenode* A, int B, int C) {
    int k1=check(A,B);
    int k2=check(A,C);
    // printf("%d  %d",k1,k2);
    if(k1==0||k2==0)
        return -1;
    treenode* x=common(A,B,C);
    return x->val;
}
