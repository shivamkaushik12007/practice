public class Solution {
    public int solve(String A) {
        String str="aeiouAEIOU";
        int count=0;
        for(int i=0;i<A.length();i++){
            // for(int j=i+1;j<=A.length();j++){
                String s=A.substring(i,A.length());
                if(str.contains(Character.toString(s.charAt(0)))){
                    count+=(A.length()-i);
                }
            // }
        }
        return count%10003;
    }
}
