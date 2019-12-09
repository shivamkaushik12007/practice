
 void store(int* x,int l,int r,int* size){
    if(l==r)
        return;
        
    x[*size]=(l+r)/2;
    *size=*size+1;
    store(x,l,((l+r)/2),size);
    store(x,((l+r)/2)+1,r,size);
 }
treenode *newNode(int item) 
{ 
    treenode *temp =  (treenode *)malloc(sizeof(treenode)); 
    temp->val = item; 
    temp->left = temp->right = NULL; 
    return temp; 
} 

treenode* insert(treenode* h,int data){
        if(h==NULL){
            return newNode(data);
        }
        
        if(h->val > data)
            h->left=insert(h->left,data);
        if(h->val < data) 
            h->right=insert(h->right,data);
            
        return h;
}

treenode* sortedArrayToBST(const int* A, int n1) {
    long int* arr=(long int*)malloc(sizeof(long int)*n1);
    int i=0;
    for(i=0;i<n1;i++){
        arr[i]=0;
    }
    int size=0;
    store(arr,0,n1,&size);
    treenode* tree=NULL;
    for(i=0;i<n1;i++){
        tree=insert(tree,A[arr[i]]);
    }
  
    return tree;
}
