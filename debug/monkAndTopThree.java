import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int l3=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int n=scanner.nextInt();
            if(n>l1){
                l3=l2;
                l2=l1;
                l1=n;
            }else if(n==l1&&n==l2){l3=n;}else if(n==l1){
                l3=l2;
                l2=l1;
            }else if(n>l2){
                l3=l2;
                l2=n;
            }else if(n==l2){
                l3=l2;
            }else if(n>l3){
                l3=n;
            }
            if(l1==Integer.MIN_VALUE||l2==Integer.MIN_VALUE||l3==Integer.MIN_VALUE){
                System.out.println("-1");
            }else{
                System.out.println(l1*l2*l3);
            }
        }
    }
}
