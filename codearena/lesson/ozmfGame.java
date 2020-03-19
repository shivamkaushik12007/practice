import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            int res=0;
            if(n<1&&n>1000000000||m<1&&m>1000000000)
                continue;
            if(a+b>=2*c){
                res+=n*a;
                res+=m*b;
            }else{
                int k=n<m?n:m;
                res+=k*res*2;
                res+=(n-k)*a;
                res+=(m-k)*b;
            }
            if(res>=-10000&&res<=10000)
                System.out.println(res);
            // else
            //     System.out.println(-1);
        }
    }
}
