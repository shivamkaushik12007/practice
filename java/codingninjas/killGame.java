import java.io.*; 
import java.util.*;
class Solution { 
	
	public static void main(String[] args) 
	{ 
	    Scanner s=new Scanner(System.in);
		
		    int n=s.nextInt();
		    int k=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            arr.add(i);
        }
        int i=1;
        int m=0;
        while(arr.size()!=1){
            if(i==k){
                arr.remove(m);
                i=1;
            }else{
                m++;
                i++;
            }
            if(m==arr.size()){
                m=0;
            }
        }
        System.out.println(arr.get(0)+1);
		    // Write your code here 
		    // Print the surviving position
	}
	
} 

