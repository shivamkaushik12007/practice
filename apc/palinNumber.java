public class Solution {
    public int isPalindrome(int A) {
        String s=Integer.toString(A);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return 0;
        }
        return 1;
    }
}
