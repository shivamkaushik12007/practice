/*
 class ListNode<t> {
    public t data;
    public ListNode<t> next;
    public ListNode(t data)
    {
        this.data=data;
    }
 }
 */
import java.util.*;
import java.lang.*;

public class Solution {
    public static ListNode<Integer> FindNode(ListNode<Integer> head, int p) {
        /* Your class should be named solution.
         * Don't write main().
         * Don't take input, it is passed as function argument.
         * Don't print output.
         * Taking input and printing output is handled automatically.
         */
        ListNode<Integer> temp=head;
        int n=-1;
        ArrayList<ListNode<Integer>> arr=new ArrayList<>();
        while(temp!=null){
            if(!arr.contains(temp)){
                arr.add(temp);
            }else{
                n=arr.indexOf(temp);
                break;
            }
            temp=temp.next;
        }
        // System.out.println(n);
        if(n!=-1){
            n-=p;
            if(n<0){
                return null;
            }
            return arr.get(n);
        }
        return null;
    }
}
