listnode* reverseBetween(listnode* A, int B, int C) {
    listnode* curr=A;
    listnode* curr1=A;
    listnode* prev1=A;
    listnode* prev=NULL;
    listnode* next1;
    if(B==C||C<B)
        return  A;
    int i=0;
    int j=0;
    while(i<C-1){
        if(j<B-1){
            prev1=curr;
            curr=curr->next;
            j++;
        }
        curr1=curr1->next;
        i++;
    }
    prev=curr1->next;
    int d=0;
    while(curr!=NULL&&d!=(C-B)+1){
        next1=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next1;
        d++;
    }
    if(B==1){
        return curr1;
    }else{
        prev1->next=curr1;
    }
        
    return A;
}

