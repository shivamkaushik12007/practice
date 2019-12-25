public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
         int count=1;
        while(true){
            if(A.contains(count)){
                count++;
            }else{
                return count;
            }
            if(count>A.size()+2)
                break;
        }
        return -1;
    }
}
