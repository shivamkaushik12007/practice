public class Solution {
    public TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
            
        if(root.val<val)
            root.right=insert(root.right,val);
        if(root.val>val)
            root.left=insert(root.left,val);
        return root;
    }
    public TreeNode sortedListToBST(ListNode a) {
        ListNode temp=a;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        if(arr.size()==1)
            return new TreeNode(arr.get(0));
        TreeNode root=null;
        root=check(root,arr,0,arr.size());
        return root;
    }
    public TreeNode check(TreeNode root,ArrayList<Integer> arr,int l,int r){
        if(l>=r||r>arr.size())
            return root;
        int mid=(l+r)/2;
        if(mid>=arr.size()){
            return root;
        }
        root=insert(root,arr.get(mid));
        root=check(root,arr,l,mid);
        root=check(root,arr,mid+1,r);
        return root;
    }
}
