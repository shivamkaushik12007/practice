import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,2);
        ArrayList<Integer> s=new ArrayList<Integer>();
        s.add(0);
        s.add(0);
        for(int i=1;i<n-1;i++){
            int temp=s.get(i);
            if(mp.get(temp)>1){
                int k1=arr.lastIndexOf(arr.get(i));
                int k2=arr.lastIndexOf(k1,arr.get(i));
                int l=i-k2;
                s.add(l);
                if(mp.get(l)==null){
                    mp.put(l,1);
                }else{
                    int klmn=mp.get(l);
                    klmn++;
                    mp.put(l,klmn);
                }
            }else{
                s.add(0);
                int lmn=mp.get(0);
                lmn++;
                mp.put(0,lmn);
            }
        }
        System.out.println(mp.get(s.get(n-1)));
	}
}
