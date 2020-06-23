class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int x=countNodes(root.left);
        int y=countNodes(root.right);
        return 1+x+y;
    }
}
