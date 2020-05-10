import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int x=i-1>=0?arr[i-1]:0;
            int y=i+1<n?arr[i+1]:0;
            if(x+y<arr[i]){
                System.out.println("NO");
                cnt++;
                break;
            }
        }
        if(cnt==0){
            System.out.println("YES");
        }
    }
}
