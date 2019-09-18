int find(treenode* root,element){
	if(root==NULL)
		return 0;
	if(root->key==element)
		return 1;
		
	return find(root->left)||find(root->right);
}

treenode* LCA(treenode* root,int a,int b){
	if(root == NULL)
		return NULL;
	
	if(root->key==a||b){
		return root;
	}
	
	treenode* x=LCA(root->left,a,b);
	treenode* y=LCA(root->right,a,b);
	
	if(x&&y){
		return root;
	}else if(x){
		return x;
	}else if(y){
		return y;
	}
	
	return NULL;
}

int main(){
	treenode* root=NULL;
	treenode* curr;
	if(find(root,a)&&find(root,b)){
		curr=LCA(root,a,b);
	}else{
		curr=NULL;
	}
}
