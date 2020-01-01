public class Solution {
    public int isPower(int A) {
        if(A==1)
            return 1;
        int n=(int)Math.sqrt(A);
        for(int i=2;i<=n;i++){
            int j=2;
            int res=i;
            while(res<=A){
                res=(int)Math.pow(i,j);
                if(res==A)
                    return 1;
                j++;
            }
        }
        return 0;
    }
}
