import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int sum=0;
            sum+=n*8;
            int k=n-1;
            int temp=(k*(k+1))/2;
            sum+=temp*6;
            System.out.println(sum);
        }
    }
}
