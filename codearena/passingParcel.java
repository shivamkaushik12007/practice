import java.lang.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int m=0;
        int i=0;
        while(arr.size()!=1){
            if(m==s.length()){
                m=0;
            }
            if(s.charAt(m)=='a'){
                i++;
            }else if(s.charAt(m)=='b'){
                arr.remove(i);
            }
            if(i==arr.size()){
                i=0;
            }
            m++;
        }
        System.out.println(arr.get(0));
    }
}
