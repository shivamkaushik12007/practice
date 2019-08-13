listnode* rotateRight(listnode* h, int k) {
    listnode* curr=h;
    listnode* prev=h;
    int i=0;
    if(curr==NULL||curr->next==NULL){
        return h;
    }
    while(curr->next!=NULL){
        i++;
        curr=curr->next;
    }
    i++;
    int k1=k%i;
    if(k1==0){
        return h;
    }
    k1=i-k1;
    listnode* curr1=h;
    int j=0;
    while(j<k1){
        prev=curr1;
        curr1=curr1->next;
        j++;
    }
    listnode* curr2=h;
    prev->next=NULL;
    curr->next=curr2;
    h=curr1;
    return h;
    
}
