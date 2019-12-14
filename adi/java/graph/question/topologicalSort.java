import java.util.*;
import java.lang.*;
public class Main{
    static Stack<Integer> st=new Stack<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<LinkedList<Integer>> arr=new LinkedList<>();
		boolean mark[]=new boolean[n];
		for(int i = 0 ; i< n ; i++){
		    int n1=sc.nextInt();
		    LinkedList<Integer> ls=new LinkedList<>();
		    for(int j=0;j<n1;j++){
		        int n2=sc.nextInt();
		        ls.add(n2);
		    }
		    arr.add(ls);
		}
    //topological sort
		for(int i=0;i<n;i++){
		    if(!mark[i]){
		        dfs(i,arr,mark);
		    }
		}
		while(!st.isEmpty()){
		    System.out.print(st.peek()+" ");
		    st.pop();
		}
	}
	public static void dfs(int i,LinkedList<LinkedList<Integer>> arr,boolean[] mark){
	    mark[i]=true;
	    for(int k:arr.get(i)){
	        if(!mark[k]){
	            dfs(k,arr,mark);
	        }
	    }
	    st.push(i);
	}
}
