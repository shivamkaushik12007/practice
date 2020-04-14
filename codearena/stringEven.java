import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=s.length();
        int[] arr=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(s.substring(i,i+1));
            if(k%2==0){
                arr[i]=1;
                cnt++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(cnt+" ");
            if(arr[i]==1){
                cnt--;
            }
        }
    }
}
