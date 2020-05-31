import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner scanner=new Scanner(System.in);
       int ans = 1;  
       int n=scanner.nextInt();
       int r=scanner.nextInt();
        int k1=fact(n);
        int k2=fact(r);
        int k3=fact(n-r);
        // System.out.println(k1);
        k1/=k2;
        k1/=k3;
        // k1*=(int)Math.pow(n-r,r);
        System.out.println(k1/2);

    }
    public static int fact(int r){
        if(r==0) return 1;
        int k=1;
        for(int i=1;i<=r;i++){
            k*=i;
        }
        return k;
    }
}
// nCr * (n-r)^r
