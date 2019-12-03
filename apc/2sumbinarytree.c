
 static int size=0;
 void fill(int* arr,treenode* root){
    if(root==NULL)
        return;
    arr[size]=root->val;
    size++;
    fill(arr,root->left);
    fill(arr,root->right);
 }
 
int t2Sum(treenode* A, int B) {
    int* arr=(int*)malloc(sizeof(int)*10000);
    fill(arr,A);
    int i=0,j=0;
    // printf("%d  %d\n",size,A->val);
    for(i=0;i<size-1;i++){
        // printf("%d ",arr[i]);
        for(j=i+1;j<size;j++){
            if(arr[i]+arr[j]==B)
                return 1;
        }
    }
    return 0;
}
