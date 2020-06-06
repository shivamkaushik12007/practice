import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long sum=0;
            int n=sc.nextInt();
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n;j++){
                    int k=i-j;
                    k=k>0?k:k*-1;
                    sum+=(long)k;
                }
            }
            sum*=(long)2;
            if(n%2==1){
                int l=n/2;
                for(int j=0;j<n;j++){
                    int k=l-j;
                    k=k>0?k:k*-1;
                    sum+=(long)k;
                }
            }
            System.out.println(sum);
        }
    }
}
