class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return check(root,arr,0);
    }
    public boolean check(TreeNode root,int[] arr,int n){
        // System.out.println(n);
        if(n==arr.length) return false;
        if(root==null) return false;
        if(arr[n]!=root.val) return false;
        if(n==arr.length-1&&root.left==null&&root.right==null) return true;
        return check(root.left,arr,n+1)||check(root.right,arr,n+1);
    }
}
