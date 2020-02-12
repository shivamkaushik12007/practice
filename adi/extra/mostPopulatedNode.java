import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int t=scanner.nextInt();
		while(t-->0){
		    int n=scanner.nextInt();
		    Map<Integer,Integer> mp=new HashMap<>();
		    for(int i=0;i<n;i++){
		        int k=scanner.nextInt();
		        if(k<n){
    		        if(mp.get(k)==null){
    		            mp.put(k,i);
    		        }else{
    		            int m=mp.get(k);
    		            m+=i;
    		            mp.set(k,m);
    		        }
		        }
		    }
		    int max=Integer.MIN_VALUE:
		    int maxNode=Integer.MIN_VALUE:
		    for(Map.Entry l:mp.entrySet()){
		        if(l.getValue>max){
		            max=l.getValue();
		            maxNode=l.getKey();
		        }
		    }
		    System.out.println(maxNode);
		}
	}
}
