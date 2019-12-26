public class Solution {
    public int[] solve(int[] A, int[] B) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<A.length;j++){
                if(A[j]>max){
                    max=A[j];
                }
                arr.add(divi(max));
            }
        }
        Collections.sort(arr);
        int arr1[]=new int[B.length];
        for(int i=0;i<B.length;i++){
            arr1[i]=arr.get(B[i]-1);
        }
        return arr1;
    }
    public int divi(int max){
        if(max<=3){
            return max%1000000007;
        }
        for(int i=2;i<max/2;i++){
            if(max%i==0){
                return (max*i)%1000000007;
            }
        }
        return max%1000000007;
    }
}
