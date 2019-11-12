public class Solution {
    public String longestCommonPrefix(String[] A) {
        int count=0;
        int x=0;
        for(int k=0;k<A.length;k++){
            if(A[x].length()>A[k].length()){
                x=k;
                // System.out.print(A[x].length()+"  ");
            }
        }
            // System.out.println(A[x].length());
            for(int i=0;i<A[x].length();i++){
            int count1=0;
                for(int j=0;j<A.length;j++){
                    if(A[x].charAt(i)!=A[j].charAt(i)){
                        count1=1;
                        break;
                    }
                }
                if(count1==1){
                    break;
                }
                count++;
            }
        // }
        return A[x].substring(0,count);
    }
}
