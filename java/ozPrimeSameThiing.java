import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            long l=scanner.nextInt();
            long r=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int cnt=0;
            for(long i=l;i<=r;i++){
                for(int j=0;j<n;j++){
                    if(i%arr[j]==0){
                        cnt++;
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
