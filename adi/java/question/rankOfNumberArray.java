import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		    if(!list.contains(arr[i])){
		        list.add(arr[i]);
		    }
		}
		
		Collections.sort(list);
		for(int i=0;i<n;i++){
		    arr[i]=list.indexOf(arr[i]);
		    System.out.print(arr[i]+" ");    
		}
		
	}
}
