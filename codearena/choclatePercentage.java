import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            int sum=0;
            int total=0;
            for(int i=0;i<n;i++){
                sum+=scanner.nextInt();
                total+=100;
            }
            double k=(double)sum/(double)total;
            k*=100;
            System.out.printf("%.8f",k );
            System.out.println();
        }
    }
}
