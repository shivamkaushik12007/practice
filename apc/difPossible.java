public class Solution {
    public int diffPossible(int[] arr, int B) {
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[i]-arr[j]==B){
                    k=1;
                    break;
                }
            }
            if(k==1)
                break;
        }
        return k;
    }
}
