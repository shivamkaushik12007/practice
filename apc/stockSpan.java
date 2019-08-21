import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		int grr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		}
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<n;i++){
		    if(st.empty()){
		        grr[i]=1;
		        st.push(i);
		    }else if(arr[st.peek()]>arr[i]){
		        grr[i]=1;
		        st.push(i);
		    }else{
		        int k=0;
		        while(arr[st.peek()]<=arr[i]){
		            st.pop();
		            if(st.empty()){
		                k++;
		                break;
		            }
		        }
		        if(k==1){
		            grr[i]=i+1;
		        }else{
		            grr[i]=i-st.peek();
		        }
		        st.push(i);
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(grr[i]+" ");    
		}
	}
}

