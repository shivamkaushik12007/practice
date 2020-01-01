public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        if(A.size()==1){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                int k1=A.get(i);
                int k2=A.get(j);
                int k=k1<k2?k1:k2;
                // int l=i==0?1:0;
                int l=j-i;
                if(k*l>max){
                    max=k*l;
                }
            }
        }
        return max;
    }
}
