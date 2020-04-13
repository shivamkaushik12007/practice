// import java.util.*;
// import java.lang.*;
// class TestClass {
//     public static void main(String args[] ) throws Exception {
//         Scanner scanner=new Scanner(System.in);
//         int t=scanner.nextInt();
//         while(t-->0){
//             int n=scanner.nextInt();
//             int k=scanner.nextInt();
//             if(k<=n){
//                 int l=0;
//                 while(Math.pow(2,l)<k){
//                     l++;
//                 }
//                 System.out.println(l+1);
//             }else{
//                 int l=0;
//                 while(Math.pow(2,l)<n){
//                     l++;
//                 }
//                 l++;
//                 int k1=k/n;
//                 int k2=k%n;
//                 int res=l*k1;
//                 l=0;
//                 while(Math.pow(2,l)<k2){
//                     l++;
//                 }
//                 System.out.println(res+l+1);
//             }
//         }
//     }
// }









import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            long n=scanner.nextLong();
            long k=scanner.nextLong();
            if(k<=n){
                int l=0;
                while(Math.pow(2,l)<k){
                    l++;
                }
                System.out.println(l+1);
            }else{
                int l=0;
                while(Math.pow(2,l)<n){
                    l++;
                }
                l++;
                long k1=k/n;
                long k2=k%n;
                long res=l*k1;
                l=0;
                if(k2!=0){
                    while(Math.pow(2,l)<k2){
                        l++;
                    }
                    l++;
                }
                System.out.println(res+l);
            }
        }
    }
}
