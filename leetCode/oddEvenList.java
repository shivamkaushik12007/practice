/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return head;
        ListNode h1=new ListNode(0);
        ListNode h2=new ListNode(0);
        ListNode k1=h1;
        ListNode k2=h2;
        ListNode temp=head;
        int i=1;
        while(temp!=null){
            if(i%2==1){
                h1.next=new ListNode(temp.val);
                h1=h1.next;
            }else{
                h2.next=new ListNode(temp.val);
                h2=h2.next;
            }
            temp=temp.next;
            i++;
        }
        h1.next=k2.next;
        return k1.next;
    }
}
