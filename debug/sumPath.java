
public class Solution {
    public int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
        check1(A);
        return res;
    }
    public void check1(TreeNode root){
        if(root==null) return;
        check(root,0);
        check1(root.left);
        check1(root.right);
    }
    public void check(TreeNode root,int sum){
        if(root==null) return;
        sum+=root.val;
        if(sum>res){
            res=sum;
            // System.out.println(res+" check "+root.val);
        }
        check(root.left,sum);
        check(root.right,sum);
    }
}
