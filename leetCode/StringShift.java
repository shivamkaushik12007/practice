class Solution {
    public String stringShift(String s, int[][] shift) {
        for(int i=0;i<shift.length;i++){
            int n=shift[i][1]%s.length();
            if(shift[i][0]==0){
                s=s.substring(n,s.length())+s.substring(0,n);
            }else{
                // StringBuffer sf=new StringBuffer()
                s=s.substring(s.length()-n,s.length())+s.substring(0,s.length()-n);
            }
            // System.out.println(s);
        }
        return s;
    }
}
