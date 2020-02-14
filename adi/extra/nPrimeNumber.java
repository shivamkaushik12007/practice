import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		arr[0]=2;
		arr[n-1]=-1;
		int k=3,m=1;
		while(arr[n-1]==-1){
		    int k1=(int)Math.sqrt((double)k);
		    int cnt=0;
		    for(int i=2;i<=k1;i++){
		        if(k%i==0){
		            cnt++;
		        }
		    }
		    if(cnt==0){
		        arr[m]=k;
		        m++;
		    }
		    k+=2;
		}
		System.out.println(arr[n-1]);
	}
}
