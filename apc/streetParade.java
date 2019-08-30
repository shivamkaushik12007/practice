import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        while(n!=0){
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Stack<Integer> st=new Stack<Integer>();
            Stack<Integer> st1=new Stack<Integer>();
            int count=1;
            int j=0;
            while(count<=n&&j<n){
                if(arr[j]==count){
                    st.push(arr[j]);
                    j++;
                    count++;
                }else if(arr[j]!=count&&!st1.empty()&&st1.peek()==count){
                    st1.pop();
                    count++;
                }else if(arr[j]!=count&&(st1.empty()||st1.peek()!=count)){
                    st1.push(arr[j]);
                    j++;
                }
            }
            
            int k=0;
             while(!st1.empty()){
                  if(st1.peek()!=count){
                      k++;
                     break;
                  }
                  count++;
                  st1.pop();
             }
            if(k==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            n=scanner.nextInt();
        }
    }
}

