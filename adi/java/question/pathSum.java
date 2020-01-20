public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        int k=check(A,0,B);
        return k;
        
    }
    public int check(TreeNode root,int sum,int res){
        if(root==null) return 0;
        sum+=root.val;
        if(sum==res&&root.left==root.right) return 1;
        int k1=check(root.left,sum,res);
        int k2=check(root.right,sum,res);
        return k1|k2;
    }
    
}
