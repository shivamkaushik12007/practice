import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            System.out.println(special(n));
        }
    }
    public static int special(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=fun(i);
            }
        }
        return sum;
    }
    public static int fun(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(gcd(n,i)==1){
                sum++;
            }
        }
        return sum;
    }
    public static int gcd(int a,int b){
        if (b == 0) 
            return a; 
        return gcd(b, a % b);  
    }
}
