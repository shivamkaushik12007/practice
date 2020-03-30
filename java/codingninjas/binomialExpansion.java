import java.io.*; 
import java.util.*;
public class Solution{ 
	public static void main(String[] args) 
	{ 
	    Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int x=scanner.nextInt();
        int n=scanner.nextInt();
        for(int i=0;i<n+1;i++){
            long temp1=(long)Math.pow(a,n-i);
            long temp2=(long)Math.pow(x,i);
            long temp3=nCr(n,i);
            System.out.print(temp1*temp2*temp3+" ");
        }
	} 
    public static long nCr(int n,int r){
        return (long)fact(n)/(fact(r)*fact(n-r));
    }
    public static long fact(int n){
        long res=1;
        for(int i=2;i<=n;i++)
            res=res*i;
        return res;
    }
} 

