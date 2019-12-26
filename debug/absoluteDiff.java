public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int max=0;
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                int k1=A.get(i);
                int k2=A.get(j);
                int k=k1<k2?k1:k2;
                int l=k1>k2?k1:k2;
                int m=l-k+j-i;
                if(max<m){
                    max=m;
                }
            }
        }
        return max;
    }
}
