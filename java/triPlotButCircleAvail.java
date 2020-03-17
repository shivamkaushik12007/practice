import java.util.*;
import java.lang.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            double a=scanner.nextDouble();
            double b=scanner.nextDouble();
            double c=scanner.nextDouble();
            double d1=a+b;
            d1+=c;
double d2=(b+c);
            d2-=a;
       double d3=(a+b);
            d3-=c;
            double d4=(c+a);
            d4-=b;
            double dr=d1*d2*d3*d4;
            // dr=(***);
            dr=Math.sqrt(dr);
            double n=a*b*c;
            double res=n/dr;
            res=3.1415*res*res;
            // DecimalFormat df = new DecimalFormat("#.####");
            System.out.format("%.4f",res);
            System.out.println();
        }
    }
}
