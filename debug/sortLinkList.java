/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        ListNode n=A;
        while(n!=null){
            ListNode k=n.next;
            while(k!=null){
                if(n.val>k.val){
                    int x=n.val;
                    n.val=k.val;
                    k.val=x;
                }
                k=k.next;
            }
            n=n.next;
        }
        return A;
    }
}
