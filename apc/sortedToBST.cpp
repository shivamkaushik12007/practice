/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 * 
 * typedef struct TreeNode treenode;
 * 
 * treenode* treenode_new(int val) {
 *     treenode* node = (treenode *) malloc(sizeof(treenode));
 *     node->val = val;
 *     node->left = NULL;
 *     node->right = NULL;
 *     return node;
 * }
 */
/**
 * @input A : Read only ( DON'T MODIFY ) Integer array
 * @input n1 : Integer array's ( A ) length
 * 
 * @Output root pointer of tree.
 */
 static size=0;
 void store(int* x,int l,int r){
    if(l==r)
        return;
        
    x[size]=(l+r)/2;
    size++;
    // printf("%d ",x[size-1]);
    store(x,l,((l+r)/2));
    store(x,((l+r)/2)+1,r);
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
    store(arr,0,n1);
    treenode* tree=NULL;
    for(i=0;i<n1;i++){
        // printf("%d",arr[i]);
        tree=insert(tree,A[arr[i]]);
    }
    return tree;
}
