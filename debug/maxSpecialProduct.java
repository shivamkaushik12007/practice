public class Solution {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            long k=(long)maxLeft(A,i)*(long)minRight(A,i);
            k=k%1000000007;
            if(max<(int)k)
                max=(int)k;
        }
        return max;
    }
    public int maxLeft(ArrayList<Integer> arr,int n){
        if(n==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr.get(i)>max&&arr.get(i)>arr.get(n)){
                max=arr.get(i);
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
    
    public int minRight(ArrayList<Integer> arr,int n){
        if(n==arr.size()-1)
            return 0;
        int min=Integer.MAX_VALUE;
        for(int i=n+1;i<arr.size();i++){
            if(arr.get(i)<min&&arr.get(i)>arr.get(n)){
                min=arr.get(i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}
