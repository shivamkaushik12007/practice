import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		
		for(int i=1;i<n;i++){
		    int curr=arr[i];
		    int j=i-1;
		    while(j>=0&&arr[j]>curr){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=curr;
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
	
}
