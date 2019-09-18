struct node{
    treenode* data;
    struct node* next;
};
void push(struct node** h,treenode* data){
    struct node* n=(struct node*)malloc(sizeof(struct node));
    n->data=data;
    n->next=NULL;
    if(*h==NULL){
        *h=n;
    }else{
        n->next=*h;
        *h=n;
    }
}
void pop(struct node** h){
    if(*h!=NULL) *h=(*h)->next;
    if(*h==NULL) return;
}
treenode* peek(struct node** h){
    return (*h)->data;
}
int empty(struct node** h){
    if(*h==NULL)
        return 1;
    return 0;
}
int* inorderTraversal(treenode* A, int *len1) {
    struct node* head=NULL;
    treenode* curr=A;
    int i=0;
    int* arr=(int*)malloc(sizeof(int));
    while(!empty(&head)||curr!=NULL){
        while(curr!=NULL){
            push(&head,curr);
            curr=curr->left;
        }
        treenode* temp=peek(&head);
        pop(&head);
        arr[i]=temp->val;
        i++;
        if(temp->right!=NULL)
            curr=temp->right;
        else
            
    }
     len1=i;
    arr[i]='\0';
    return arr;
}

