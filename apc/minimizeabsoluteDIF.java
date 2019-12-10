public class Solution {
    public int solve(int[] arr, int[] brr, int[] crr) {
        int k1=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr.length;j++){
                for(int k=0;k<crr.length;k++){
                    int min=min(arr[i],brr[j],crr[k]);
                    int max=max(arr[i],brr[j],crr[k]);
                    if(k1>max-min)
                        k1=max-min;
                }
            }
        }
        return k1;
    }
    public int min(int a,int b,int c){
        int k=a<b?a:b;
        k=k<c?k:c;
        return k;
    }
    public int max(int a,int b,int c){
        int k=a>b?a:b;
        k=k>c?k:c;
        return k;
    }
}
