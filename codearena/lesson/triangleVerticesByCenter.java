import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();
        double x3=scanner.nextDouble();
        double y3=scanner.nextDouble();
        double x=x1+x2+x3;
        double y=y1+y2+y3;
        double xr1=(x-x2*2);
        double yr1=(y-y2*2);
        double xr2=(x-x3*2);
        double yr2=(y-y3*2);
        double xr3=(x-x1*2);
        double yr3=(y-y1*2);
        System.out.format("%.4f %.4f", xr2,yr2);
        System.out.println();
        System.out.format("%.4f %.4f", xr3,yr3);
        System.out.println();
        System.out.format("%.4f %.4f", xr1,yr1);
        System.out.println();
    }
}
