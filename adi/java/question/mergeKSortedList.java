
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> a) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            ListNode temp=a.get(i);
            while(temp!=null){
                arr.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(arr);
        ListNode ln=new ListNode(arr.get(0));
        ListNode temp=ln;
        for(int i=1;i<arr.size();i++){
            ListNode ln1=new ListNode(arr.get(i));
            temp.next=ln1;
            temp=temp.next;
        }
            // System.out.print(arr.get(i)+" ");
        return ln;
    }
}
