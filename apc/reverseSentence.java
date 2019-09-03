public class Solution {
    public String solve(String A) {
        String[] str=A.trim().split(" ");
        int n=str.length;
        String res=new String("");
        for(int i=n-1;i>=0;i--){
            res=res+str[i]+" ";
        }
        res=res.trim();
        return res;
    }
}
