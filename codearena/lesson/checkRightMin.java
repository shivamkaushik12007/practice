import java.util.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            for(int i=0;i<n-1;i++){
                int cnt=0;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[i]){
                        cnt++;
                    }
                }
                System.out.print(cnt+" ");
            }
            System.out.println("0");
        }
    }
}
