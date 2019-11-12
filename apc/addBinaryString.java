public class Solution {
    public long toInt(String a){
        long x=1;
        long res=0;
        for(int i=a.length()-1;i>=0;i--){
            int k=a.charAt(i)=='1'?1:0;
            res+=(x*k);
            x=x*2;
        }
        return res;
    }
    
    public String toBin(long a,long b){
        long x=a+b;
        String s="";
        while(x>0){
            s=Long.toString(x%2)+s;
            x=x/2;
        }
        return s;
    }
    public String addBinary(String A, String B) {
        long x=toInt(A);
        long y=toInt(B);
        // System.out.println(x+" /"+y);
        return toBin(x,y);
    }
}
