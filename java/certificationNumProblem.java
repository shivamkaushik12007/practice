import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int sum=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                int temp=scanner.nextInt();
                arr[i]=sum;
                sum+=temp;
            }
            int cnt=0;
            for(int i=1;i<n-1;i++){
                if(arr[i]==sum-arr[i+1]){
                    System.out.println((i+1)+" "+arr[i]);
                    cnt++;
                    break;
                }
            }
            if(cnt==0){
                System.out.println("0 0");
            }
        }
    }
}
