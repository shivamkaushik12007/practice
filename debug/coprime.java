public class Solution {
    public int cpFact(int A, int B) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=A;i++){
            if(A%i==0){
                int k=gcd(B,i);
                if(k==1)
                    return i;
            }
        }
        return -1;
    }
    public int gcd(int a,int b){
        int k=a<b?a:b;
        for(int i=k;i>=1;i--){
            if(a%i==0&&b%i==0)
                return i;
        }
        return -1;
    }
}
