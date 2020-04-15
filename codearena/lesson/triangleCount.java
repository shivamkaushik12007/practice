import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            long n=scanner.nextLong();
            // long k1=n*8;
            // long k2=(n*(n-1))/2;
            // k2*=6;
            long k1=14*n-6;
            System.out.println(k1);
        }
    }
}
