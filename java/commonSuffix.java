import java.util.*;
public class Solution {
	public static void answer(String arr[]) {
        String s="";
        String res="";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<min){
                min=arr[i].length();
                s=arr[i];
            }
        }
        for(int i=0;i<s.length();i++){
            int cnt=0;
            String k=s.substring(i,i+1);
            for(int j=0;j<arr.length;j++){
                if(arr[j].substring(i,i+1).equals(k)){
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt==arr.length){
                res+=k;
            }else{
                break;
            }
        }
        System.out.println(res);
	}
}
