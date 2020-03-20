import java.util.*;
import java.lang.*;
public class Solution {

	public static void Special(int num) {
		// Write your code here
        if(!check(num)){
            System.out.println("Not Special");
        }else{
            ArrayList<Integer> arr=new ArrayList<>();
            int k=2;
            int m=k*k*k;
            while(m<num){
                if(!arr.contains(k)){
                    int t=m;
                    while(t<num){
                        if(!arr.contains(t))
                            arr.add(t);
                        t+=m;
                    }
                }
                k++;
                m=k*k*k;
            }
            System.out.println(num-arr.size());
        }
	}
    public static boolean check(int n){
        int k=2;
        while(k*k*k<=n){
            int l=k*k*k;
            if(n%l==0)
                return false;
            k++;
        }
        return true;
    }
}
