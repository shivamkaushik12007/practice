import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        char c='a';
        String s=scanner.next();
        for(int i=0;i<n;i++){
            char c1=s.charAt(i);
            if(c1>c){
                c=c1;
            }
        }
        String res=Character.toString(c);
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                // for(int j=i;j<n;j++){
                    String temp=s.substring(i,n);
                    if(res.compareTo(temp)<0){
                        res=temp;
                    }
                // }
            }
        }
        System.out.println(res);
    }
}
