import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int sum=0;
            int p=0;
            for(int i=0;i<n;i++){
                int temp=scanner.nextInt();
                if(prime(temp)){
                    p++;
                }
                if(p==k){
                    sum+=temp;
                    p=0;
                }
            }
            System.out.println(sum);
        }
    }
    public static boolean prime(int n){
        if(n==1) return false;
        if(n==2)return true;
        if(n%2==0)return false; 
        int k=(int)Math.sqrt(n);
        for(int i=3;i<=k;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
        
    }
}
