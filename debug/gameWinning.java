import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        while(q-->0){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            l--;
            r--;
            int res=0;
            for(int i=l;i<=r;i++){
                // int temp=arr[i];
                res=0;
                int temp=(int)(Math.log(arr[i])/Math.log(2));
                temp++;
                System.out.println("checking"+temp);
                if(temp%2==0){
                }else{
                    if(res==0){
                        res=1;
                    }else{
                        res=0;
                    }
                }
                // while(temp!=0){
                //     temp/=2;
                //     if(res==0){
                //         res=1;
                //     }else{
                //         res=0;
                //     }
                // }
            }
            if(res==1){
                System.out.println("Mishki");
            }else{
                System.out.println("Hacker");
            }
        }
    }
}
