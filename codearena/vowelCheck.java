import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        if(s.indexOf('a')==-1||s.indexOf('e')==-1||s.indexOf('i')==-1||s.indexOf('o')==-1||s.indexOf('u')==-1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
