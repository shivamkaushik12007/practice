public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i;j<A.length;j++){
                sum+=A[j];
                if(sum>max)
                    max=sum;
            }
        }
        return max;
        
    }
}
