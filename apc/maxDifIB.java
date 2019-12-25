public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
        if(A.length<2)
            return 0;
        Arrays.sort(A);
        int max=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i+1]-A[i]>max){
               max=A[i+1]-A[i];
            }
        }
        return max;
    }
}
