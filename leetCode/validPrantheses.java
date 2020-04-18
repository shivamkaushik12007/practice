import java.util.*;
import java.lang.*;
class Solution {
    public boolean checkValidString(String s) {
        // return check(s,new Stack<Character>(),0);
        return check(s,0,0);
    }
    public boolean check(String s,int cnt,int n){
        if(n==s.length()){
            if(cnt==0) return true;
            return false;
        }
        if(s.charAt(n)=='('){
            cnt++;
            n++;
            return check(s,cnt,n);
        }else if(s.charAt(n)==')'){
            if(cnt==0){
                return false;
            }else{
                cnt--;
                if(cnt==0&&n==s.length()-1){
                    return true;
                }
            }
            n++;
            return check(s,cnt,n);
        }else if(s.charAt(n)=='*'){
            String s1=s.substring(0,n)+"("+s.substring(n+1,s.length());
            String s2=s.substring(0,n)+")"+s.substring(n+1,s.length());
            String s3=s.substring(0,n)+s.substring(n+1,s.length());
            return check(s1,cnt,n)||check(s2,cnt,n)||check(s3,cnt,n);
        }
        return true;
    }
    // public boolean check(String s,Stack<Character> st,int n){
    //     if(n==s.length()){
    //         if(st.isEmpty()) return true;
    //         return false;
    //     }
    //     if(s.charAt(n)=='('){
    //         st.push('(');
    //         n++;
    //         Stack<Character> sd=(Stack<Character>)st.clone();
    //         return check(s,sd,n);
    //     }else if(s.charAt(n)==')'){
    //         if(st.isEmpty()){
    //             return false;
    //         }else{
    //             st.pop();
    //             if(st.isEmpty()&&n==s.length()-1){
    //                 return true;
    //             }
    //         }
    //         n++;
    //         Stack<Character> sd=(Stack<Character>)st.clone();
    //         return check(s,sd,n);
    //     }else if(s.charAt(n)=='*'){
    //         String s1=s.substring(0,n)+"("+s.substring(n+1,s.length());
    //         String s2=s.substring(0,n)+")"+s.substring(n+1,s.length());
    //         String s3=s.substring(0,n)+s.substring(n+1,s.length());
    //         Stack<Character> sd1=(Stack<Character>)st.clone();
    //         Stack<Character> sd2=(Stack<Character>)st.clone();
    //         Stack<Character> sd3=(Stack<Character>)st.clone();
    //         return check(s1,sd1,n)||check(s2,sd2,n)||check(s3,sd3,n);
    //     }
    //     return true;
    // }
}
