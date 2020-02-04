public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode temp=head;
        Map<RandomListNode,RandomListNode> mp=new HashMap<>();
        while(temp!=null){
            RandomListNode res=new RandomListNode(temp.label);
            mp.put(temp,res);
            temp=temp.next;
        }
        for(Map.Entry<RandomListNode, RandomListNode> l : mp.entrySet()){
            RandomListNode temp1=l.getKey();
            RandomListNode temp2=l.getValue();
            temp2.next=mp.get(temp1.next);
            temp2.random=mp.get(temp1.random);
        }
        temp=head;
        return mp.get(temp);
    }
}
