import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int ni=sc.nextInt();
            int nj=sc.nextInt();
            int e=0;
            int o=0;
            for(int i=1;i<=ni;i++){
                int k=i>nj?nj:i;
                if(i%2==0){
                    e+=k;
                }else{
                    o+=k;
                }
            }
            System.out.println(e+" "+o);
        }
    }
}
