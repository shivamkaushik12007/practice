class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        for(int i=0;i<s.length();i++){
            k=t.indexOf(s.charAt(i),k);
            // System.out.println(s.charAt(i)+" "+k);
            if(k==-1)return false;
            k++;
        }
        return true;
    }
}
