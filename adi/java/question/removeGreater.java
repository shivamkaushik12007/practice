    public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
    // Write your code here
        SinglyLinkedListNode temp=listHead;
        while(temp.next!=null){
            if(temp.next.data>x){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        if(listHead.data>x){
            return listHead.next;
        }
        return listHead;

    }

}
