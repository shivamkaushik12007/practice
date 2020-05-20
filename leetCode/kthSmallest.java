
class Solution {
    ArrayList<Integer> arr;
    public int kthSmallest(TreeNode root, int k) {
        arr=new ArrayList<>();
        check(root);
        Collections.sort(arr);
        if(arr.size()<k){
            return -1;
        }
        return arr.get(k-1);
    }
    public void check(TreeNode root){
        if(root==null) return;
        arr.add(root.val);
        check(root.left);
        check(root.right);
    }
}
