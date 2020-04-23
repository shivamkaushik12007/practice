/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return max1(height(root.left)+height(root.right),diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
    }
    public int height(TreeNode root){
        if(root==null)
            return 0;
        return 1+max(height(root.left),height(root.right));
    }
    public int max(int x,int y){
        return x>y?x:y;
    }
    public int max1(int x,int y,int z){
        x=x>y?x:y;
        return x>z?x:z;
    }
}
