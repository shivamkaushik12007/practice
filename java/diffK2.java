public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                if(A.get(i)-A.get(j)==B||A.get(j)-A.get(i)==B)
                    return 1;
            }
        }
        return 0;
    }
}
