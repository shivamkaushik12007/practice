
 void check(treenode* root,int* arr,int* size){
    if(root==NULL)
        return;
    arr[*size]=root->val;
    *size=*size+1;
    check(root->left,arr,size);
    check(root->right,arr,size);
 }
 
 int comp(const void* a,const void* b){
     return *(int*)a-*(int*)b;
 }
 
int kthsmallest(treenode* A, int B) {
    int* arr=(int*)malloc(sizeof(int)*100000);
    int size=0;
    check(A,arr,&size);
    qsort((void*)arr,size,sizeof(int),comp);
    return arr[B-1];
}
