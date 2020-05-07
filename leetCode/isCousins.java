/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] arr1=new int[2];
        int[] arr2=new int[2];
        level(root,x,0,arr1);
        level(root,y,0,arr2);
        if(arr1[1]==arr2[1]&&arr1[0]!=arr2[0]) return true;
        return false;
    }
    public void level(TreeNode root,int x,int cnt,int[] arr){
        if(root==null) return;
        if((root.left!=null&&root.left.val==x)||(root.right!=null&&root.right.val==x)){
            arr[0]=root.val;
            arr[1]=cnt+1;
            return;
        }
        int k=cnt+1;
        level(root.right,x,k,arr);
        level(root.left,x,k,arr);
    }
}
