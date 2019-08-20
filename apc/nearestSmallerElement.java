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
	            grr[i]=-1;
	            st.push(arr[i]);
	        }else{
	            if(st.peek()<arr[i]){
	                grr[i]=st.peek();
	                st.push(arr[i]);
	            }else{
	                while(st.peek()>=arr[i]&&!st.empty()){
	                    st.pop();
	                    if(st.empty())
	                        break;
	                }
	                if(st.empty()){
	                    grr[i]=-1;
	                    st.push(arr[i]);
	                }else{
	                    grr[i]=st.peek();
	                    st.push(arr[i]);
	                }
	            }
	        }
	    }
	    
	    for(int i=0;i<n;i++){
	        System.out.print(grr[i]+" ");
	    }
	}
}
