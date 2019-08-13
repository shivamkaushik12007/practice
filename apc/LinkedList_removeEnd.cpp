listnode* removeNthFromEnd(listnode* A, int x) {
    listnode* curr=A;
    int i=0;
    while(curr!=NULL){
        i++;
        curr=curr->next;
    }
    curr=A;
    if(i<=x){
        A=curr->next;
        curr->next=NULL;
        return A;
    }
    if(x==1){
        while(curr->next->next!=NULL){
            curr=curr->next;
        }
        curr->next=NULL;
        return A;
    }

    i=i-x+1;
    int j=0;
    while(j<i-2){
        j++;
        curr=curr->next;
    }
    curr->next=curr->next->next;
    return A;
}
