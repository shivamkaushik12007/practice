import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            String s=scanner.next();
            int c1=0,c2=0,c3=0,c4=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='r'){
                    c1++;
                }else if(ch=='u'){
                    c2++;
                }else if(ch=='b'){
                    c3++;
                }else if(ch=='y'){
                    c4++;
                }
            }
            int k1=c1<c2?c1:c2;
            k1=k1<c3?k1:c3;
            k1=k1<c4?k1:c4;
            System.out.println(k1);
        }
    }
}
