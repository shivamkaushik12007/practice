import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Arrays.sort(arr);
            int cnt=0;
            int mnt=0;
            for(int i=0;i<n;i++){
                int k=i/6;
                if(arr[i]-i-k<=0){
                    cnt=i;
                    mnt++;
                    break;
                }
            }
            if(mnt==1){
                System.out.println("Goodbye Rick");
                System.out.println(cnt);
            }else{
                System.out.println("Rick now go and save Carl and Judas");
            }
        }
    }
}
