public class Solution {
    public int isPalindrome(String a) {
        int n=a.length();
        a=a.toLowerCase();
        String A="";
        for(int i=0;i<n;i++){
            if((a.charAt(i)>='a'&&a.charAt(i)<='z')||(a.charAt(i)>='0'&&a.charAt(i)<='9')){
                A=A+Character.toString(a.charAt(i));
            }
        }
        
        StringBuffer st=new StringBuffer(A);
        st=st.reverse();
        String str=st.toString();
        if(str.equals(A))
            return 1;
        
        return 0;
    }
}
