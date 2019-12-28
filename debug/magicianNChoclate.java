public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        long sum=0;
        for(int i=0;i<A;i++){
            Collections.sort(B,Collections.reverseOrder());
            sum+=(B.get(0)%100000007);
            B.set(0,B.get(0)/2);
        }
        return (int)sum;
    }
}
