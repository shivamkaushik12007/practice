import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String s="abcdefghijklmnopqrstuvwxyz";
        while(t-->0){
            int v=scanner.nextInt();
            String str=scanner.next();
            int n=str.length();
            int i=0;
            int j=0;
            int c=0;
            int cnt=0;
            while(i<n||j<n){
                if(c<v&&j<n){
                    c+=(s.indexOf(Character.toString(str.charAt(j)))+1);
                        j++;
                }else if(c==v){
                    cnt++;
                    c-=(s.indexOf(Character.toString(str.charAt(i)))+1);
                    i++;
                }else{
                    c-=(s.indexOf(Character.toString(str.charAt(i)))+1);
                    i++;
                }
            }
            System.out.println(cnt);
        }
    }
}
