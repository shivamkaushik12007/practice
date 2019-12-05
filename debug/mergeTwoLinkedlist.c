
 void insert(listnode** h,int val,listnode** res){
    listnode* n=(listnode*)malloc(sizeof(listnode));
    n->val=val;
    n->next=NULL;
    if(*h==NULL){
        *h=n;
        *res=*h;
        return;
    }
    // listnode* cur=*h;
    // while(cur->next!=NULL){
    //     cur=cur->next;
    // }
    // cur->next=n;
    (*res)->next=n;
    (*res)=(*res)->next;
    return;
 }
 
listnode* mergeTwoLists(listnode* A, listnode* B) {
    listnode* list=NULL;
    listnode* res=NULL;
    listnode* cur1=A;
    listnode* cur2=B;
    while(cur1!=NULL&&cur2!=NULL){
        if(cur1->val<cur2->val){
            insert(&list,cur1->val,&res);
            cur1=cur1->next;
        }else{
            insert(&list,cur2->val,&res);
            cur2=cur2->next;
        }
    }
    while(cur1!=NULL){
        insert(&list,cur1->val,&res);
        cur1=cur1->next;
    }
    while(cur2!=NULL){
        insert(&list,cur2->val,&res);
        cur1=cur1->next;
    }
    return list;
}
