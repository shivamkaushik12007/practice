// void sortedInsert(struct node** head_ref, struct node* new_node){
//     //complete the code

//     struct node* temp=*head_ref;
//     if(temp->data>new_node->data){
//     struct node* temp1=*head_ref;
//         while(!(temp1->next==temp)){
//             temp1=temp1->next;
//         }
//         new_node->next=temp;
//         temp1->next=new_node;
//         (*head_ref)=new_node;
//         return;
//     }
//     while(temp->next->data<new_node->data){
//         temp=temp->next;
//     }
//     new_node->next=temp->next;
//     temp->next=new_node;
// }



void sortedInsert(struct node** head_ref, struct node* new_node){
    //complete the code
    if(*head_ref==NULL){
        *head_ref=new_node;
        new_node->next=new_node;
        return;
    }
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
    if(temp->next==temp){
        temp->next=new_node;
        new_node->next=temp;
        return;
    }
    struct node* temp1=*head_ref;
    while(temp->next->data<new_node->data&&temp->next!=temp1){
        // printf("%d",temp->data);
        temp=temp->next;
        
    }
    new_node->next=temp->next;
    temp->next=new_node;
}
