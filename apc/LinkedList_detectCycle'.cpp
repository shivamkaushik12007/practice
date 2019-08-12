listnode* detectCycle(listnode* A) {
    listnode* n=(listnode*)malloc(sizeof(listnode));
    listnode* curr=A;
    listnode* next=curr->next;
    int i=1;
    while(i==1){
        if(curr->next==n){
            return curr;
            break;
        }
        
        curr->next=n;
        curr=next;
        next=curr->next;
        if(curr->next==NULL)
            break;
    }
    return NULL;
}
