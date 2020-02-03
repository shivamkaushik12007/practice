void sortedInsert(struct node** head_ref, struct node* new_node){
    //complete the code

    struct node* temp=*head_ref;
    if(temp->data>new_node->data){
    struct node* temp1=*head_ref;
        while(!(temp1->next==temp)){
            temp1=temp1->next;
        }
        new_node->next=temp;
        temp1->next=new_node;
        (*head_ref)=new_node;
        return;
    }
    while(temp->next->data<new_node->data){
        temp=temp->next;
    }
    new_node->next=temp->next;
    temp->next=new_node;
}
