import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner scanner=new Scanner(System.in);
       int t=scanner.nextInt();
       while(t-->0){
           int n=scanner.nextInt();
           int k=scanner.nextInt();
           int cnt=0;
           for(int i=n;i>=3;i--){
               if(check(i,k)){
                   cnt++;
               }
           }
           System.out.println(cnt);
       }
    }
    public static boolean check(int n,int k){
        String s="";
        while(n!=0){
            s+=Integer.toString(n%2);
            n/=2;
        }
        int m=0,cnt=0;
        while(m!=-1){
            m=s.indexOf("101",m);
            if(m!=-1){
                cnt++;
            }
        }
        if(cnt>=k) return true;
        return false;
    }
}
