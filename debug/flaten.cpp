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
 * @Output root pointer of tree.
 */
 treenode* root;
 
//  treenode* virt;
 void insert(treenode* res,int key){
    if(res==NULL)
        res->val=key;
    treenode* temp=res;
    while(temp->right!=NULL){
        temp=temp->right;
    }
    treenode* n=(treenode*)malloc(sizeof(treenode));
    n->val=key;
    n->right=n->left=NULL;
    temp->right=n;
 }
 void inorder(treenode* c){
    // if(c==NULL)
    //     return;
    
    insert(root,c->val);
    if(c->left->val!=-1)
        inorder(c->left);
    
    if(c->right->val!=-1)
        inorder(c->right);
 }
treenode* flatten(treenode* A) {
    root=NULL;
    inorder(A);
    return root;
}
