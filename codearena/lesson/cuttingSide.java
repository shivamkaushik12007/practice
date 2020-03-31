import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int p=s.nextInt();
            for(int i=0;i<p;i++){
                if(n%2==0){
                    n=n/2;
                    n++;
                }else{
                    n=(n-1)/2;
                    n+=2;
                }
            }
            System.out.println(n);
        }
    }
}
