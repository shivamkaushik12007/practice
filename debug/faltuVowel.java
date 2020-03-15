import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scannner(System.in);
        int n=scanner.nextInt();
        String s1="aeiou";
        String s2="";
        for(int i=0;i<n;i++){
            String k=scanner.next();
            if(s1.contains(k)&&!s2.contains(k)){
                s2+=k;
            }
        }
        if(s2.length()==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
