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
 * @input A : Root pointer of the tree 
 * 
 * @Output Integer array. You need to malloc memory, and fill the length in len1
 */
 
 void check(treenode* root,int* arr){
    if(root==NULL)
        return;
    if(root->right!=NULL&&root->val>root->right->val){
        arr[0]=root->right->val;
        arr[1]=root->val;
        return;
    }else if(root->left!=NULL&&root->val<root->left->val){
        arr[0]=root->val;
        arr[1]=root->left->val;
        return;
    }else{
        check(root->left,arr);
        check(root->right,arr);
    }
 }
 
int* recoverTree(treenode* A, int *len1) {
    int* len=(int*)malloc(sizeof(int)*10);
    len[0]=0;
    len[1]=0;
    check(A,len);
    // printf("%d %d \n",len[0],len[1]);
    *len1=2;
    return len;
}
