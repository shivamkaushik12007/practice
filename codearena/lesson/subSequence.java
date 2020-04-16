import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=scanner.nextInt();
        while(n-->0){
            String temp=s;
            String k=scanner.next();
            int cnt=0;
            int l=0;
            for(int i=0;i<k.length();i++){
                l=temp.indexOf(k.charAt(i),l);
                if(l==-1){
                    cnt++;
                    break;
                }
            }
            if(cnt>0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
