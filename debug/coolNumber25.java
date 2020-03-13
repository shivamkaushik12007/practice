import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            int sum=0;
            for(int i=l;i<=r;i++){
                sum+=cool(i);
            }
            System.out.println(sum);
        }
    }
    public static int cool(int n){
        int l1=check(n,Integer.MAX_VALUE,2);
        int l2=check(n,Integer.MAX_VALUE,5);
        return l1<l2?l1:l2;
    }
    public static int check(int n,int prev,int num){
        String s1=Integer.toString(num)+"2";
        String s2=Integer.toString(num)+"5";
        int k1=Integer.parseInt(s1);
        int k2=Integer.parseInt(s2);
        if(num-n>0){
            if(prev<num-n){
                return 
            }
            int l1=check(n,num-n,k1);
            int l2=check(n,num-n,k2);
            return l1<l2?l1:l2;
        }
        int l1=check(n,prev,k1);
        int l2=check(n,prev,k2);
        return l1<l2?l1:l2;
    }
    // public static int cool(int n){
    //     int k=-1;
    //     if(n%10>2&&n%10<5){
    //         n+=(5-(n%10));
    //         k=1;
    //     }else if(n%10<2){
    //         n+=(2-(n%10));
    //         k=0;
    //     }else if(n%10!=2&&n%10!=5){
    //             n+=(12-(n%10));
    //             k=0;
    //     }
    //     int c=1;
    //     while(c==1){
    //         c=check(n);
    //         if(k==0){
    //             n+=3;
    //             k=1;
    //         }else{
    //             n+=7;
    //             k=0;
    //         }
    //     }
    //     return c;
    // }
    // public static int check(int n){
    //     int l=n;
    //     while(l>0){
    //         int k=l%10;
    //         if(k!=2&&k!=5){
    //             return 1;
    //         }
    //         l/=l;
    //     }
    //     return n;
    // }
}
import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            int sum=0;
            for(int i=l;i<=r;i++){
                sum+=cool(i);
            }
            System.out.println(sum);
        }
    }
    public static int cool(int n){
        int l1=check(n,Integer.MAX_VALUE,2);
        int l2=check(n,Integer.MAX_VALUE,5);
        return l1<l2?l1:l2;
    }
    public static int check(int n,int prev,int num){
        String s1=Integer.toString(num)+"2";
        String s2=Integer.toString(num)+"5";
        int k1=Integer.parseInt(s1);
        int k2=Integer.parseInt(s2);
        if(num-n>0){
            if(prev<num-n){
                return 
            }
            int l1=check(n,num-n,k1);
            int l2=check(n,num-n,k2);
            return l1<l2?l1:l2;
        }
        int l1=check(n,prev,k1);
        int l2=check(n,prev,k2);
        return l1<l2?l1:l2;
    }
    // public static int cool(int n){
    //     int k=-1;
    //     if(n%10>2&&n%10<5){
    //         n+=(5-(n%10));
    //         k=1;
    //     }else if(n%10<2){
    //         n+=(2-(n%10));
    //         k=0;
    //     }else if(n%10!=2&&n%10!=5){
    //             n+=(12-(n%10));
    //             k=0;
    //     }
    //     int c=1;
    //     while(c==1){
    //         c=check(n);
    //         if(k==0){
    //             n+=3;
    //             k=1;
    //         }else{
    //             n+=7;
    //             k=0;
    //         }
    //     }
    //     return c;
    // }
    // public static int check(int n){
    //     int l=n;
    //     while(l>0){
    //         int k=l%10;
    //         if(k!=2&&k!=5){
    //             return 1;
    //         }
    //         l/=l;
    //     }
    //     return n;
    // }
}
