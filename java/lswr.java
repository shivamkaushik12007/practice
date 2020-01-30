public class Solution {
    public int lengthOfLongestSubstring(String A) {
        String s=new String();
        int k=0;
        for(int i=0;i<A.length();i++){
            String l=Character.toString(A.charAt(i));
            if(!s.contains(l)){
                s+=l;
                if(s.length()>k){
                    k=s.length();
                }
            }else{
                int m=s.indexOf(l);
                s=s.substring(m+1,s.length());
                s+=l;
            }
        }
        return k;
    }
}
