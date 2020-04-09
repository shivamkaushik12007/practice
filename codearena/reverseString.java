import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            String s=scanner.next();
            for(int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
