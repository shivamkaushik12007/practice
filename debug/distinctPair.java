import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {
    public static int countPairs(List<Integer> arr, long k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<arr.size()-1;i++){
            int k1=arr.get(i);
            for(int j=i+1;j<arr.size();j++){
                int k2=arr.get(j);
                if(k1+k2==k&&mp.get(k1)==null){
                    cnt++;
                    mp.put(k1,k2);
                    mp.put(k2,k1);
                }
            }
        }
        return cnt;
    }
}

public class Solution {
