// import java.util.*;
// import java.lang.*;
// import java.math.BigInteger;
// class TestClass {
//     public static void main(String args[] ) throws Exception {
//         Scanner scanner=new Scanner(System.in);
//         int t=scanner.nextInt();
//         while(t-->0){
//             int m=scanner.nextInt();
//             // long x=0;
//             BigInteger x=new BigInteger("0");
//             while(m-->0){
//                 long k1=scanner.nextInt();
//                 long k2=scanner.nextInt();
//                 x+=(k1*k2);
//                 BigInteger b1=new BigInteger(scanner.next());
//                 BigInteger b2=new BigInteger(scanner.next());
//                 x.add(b1.multiply(b2));
//             }
//             System.out.println(check(x));
//         }
//     }
//     public static BigInteger check(BigInteger x){
//         BigInteger b1=new BigInteger("10");
//         while(x.remainder(b1)>0){
//             x=check1(x);
//         }
//         return x;
//     }
//     public static BigInteger check1(BigInteger x){
//         BigInteger m=newz;
//         while(x!=0){

//             m+=x%10;
//             x/=10;
//         }
//         return m;
//     }
// }




import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int m=scanner.nextInt();
            long x=0;
            while(m-->0){
                long k1=scanner.nextInt();
                long k2=scanner.nextInt();
                x+=(k1*k2);
            }
            System.out.println(check(x));
        }
    }
    public static long check(long x){
        while(x/10>0){
            x=check1(x);
        }
        return x;
    }
    public static long check1(long x){
        long m=0;
        while(x!=0){
            m+=x%10;
            x/=10;
        }
        return m;
    }
}
