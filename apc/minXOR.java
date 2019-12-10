public class Solution {
    public int findMinXor(int[] A) {
        int min=Integer.MAX_VALUE ;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(min>(A[i]^A[j]))
                    min=A[i]^A[j];
            }
        }
        return min;
    }
}
