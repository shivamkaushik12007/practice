#include<stdio.h>
#include<stdlib.h>

/* structure for a node */
struct node
{
  int data;
  struct node *next;
};

void sortedInsert(struct node** head_ref, struct node* new_node)
{
    //complete the code
    struct node *curr=*head_ref;
    if(*head_ref==NULL){
        *head_ref=new_node;
        new_node->next=*head_ref;
    }else if(curr->data >= new_node->data){
        while(curr->next != *head_ref)  
            curr = curr->next;  
        curr->next = new_node;  
        new_node->next = *head_ref;  
        *head_ref = new_node; 
    }else{
     while(curr->next->data<new_node->data&&curr->next!=*head_ref){
         curr=curr->next;
     }
     if(curr->next==*head_ref){
         curr->next=new_node;
         new_node->next=*head_ref;
         return;
     }
     new_node->next=curr->next;
     curr->next=new_node;
    }
}

void printList(struct node *start)
{
  struct node *temp;

  if(start != NULL)
  {
    temp = start;
    
    do {
      printf("%d\n", temp->data);
      temp = temp->next;
    } while(temp != start);
  }
}

/* Driver program to test above functions */
int main()
{
  int arr; //= {12, 56, 2, 11, 1, 90};
  int list_size, i;

  /* start with empty linked list */
  struct node *start = NULL;
  struct node *temp;
    
  int n;
  scanf("%d",&n);

  /* Create linked list from the array arr[].
    Created linked list will be 1->2->11->56->12 */
  for(i = 0; i< n; i++)
  {
    temp = (struct node *)malloc(sizeof(struct node));
    scanf("%d",&arr);
    temp->data = arr;
    sortedInsert(&start, temp);
  }

  printList(start);
  //getchar();
  return 0;
}
