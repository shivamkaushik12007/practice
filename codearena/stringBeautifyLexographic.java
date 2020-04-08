import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            String s1=scanner.next();
            String s2=scanner.next();
            char[] c=s2.toCharArray();
            Arrays.sort(c);
            int i=0,j=0;
            while(i<s1.length()&&j<c.length){
                if(s1.charAt(i)>c[j]){
                    if(i==0){
                        s1=Character.toString(c[j])+s1.substring(1,s1.length());
                    }else{
                        s1=s1.substring(0,i)+Character.toString(c[j])+s1.substring(i+1,s1.length());
                    }
                    j++;
                }else{
                    i++;
                }
            }
            System.out.println(s1);
        }
    }
}
