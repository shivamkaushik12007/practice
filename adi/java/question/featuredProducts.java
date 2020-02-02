import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'featuredProduct' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY products as parameter.
     */

    public static String featuredProduct(List<String> products) {
    // Write your code here
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<products.size();i++){
            if(mp.get(products.get(i))==null){
                mp.put(products.get(i),1);
            }else{
                mp.put(products.get(i),mp.get(products.get(i))+1);
            }
        }
       String s=getName(mp);
    //    System.out.println(mp);
       return s;
    }
    public static String getName(Map<String,Integer> map){
        int max=Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        List<String> ls=new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==max){
                ls.add(entry.getKey());
            }
        }
        Collections.sort(ls);
        return ls.get(ls.size()-1);
    }
}
public class Solution {
