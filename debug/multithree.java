public class Solution {
    public int maxp3(ArrayList<Integer> A) {
        // Collections.sort(A);
        // int n=A.size();
        // return A.get(n-1)*A.get(n-2)*A.get(n-3);
        int max=Integer.MIN_VALUE; 
        for(int i=0;i<A.size()-2;i++){
            for(int j=i+1;j<A.size()-1;j++){
                for(int k=j+1;k<A.size();k++){
                    int l=A.get(i)*A.get(j)*A.get(k);
                    if(l>max)
                        max=l;
                }
            }
        }
        return max;
    }
}
