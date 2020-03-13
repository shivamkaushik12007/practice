import java.util.*;
import java.lang.*;
//to find the position of the person after getting the path direction via string
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner =new Scanner(System.in);
        String s=scanner.next();
        int x=0,y=0,n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='L'){
                x--;
            }else if(c=='R'){
                x++;
            }else if(c=='U'){
                y++;
            }else if(c=='D'){
                y--;
            }
        }
        System.out.println(x+" "+y);
    }
}
