public class Solution {
    public String convert(String A, int B) {
        if(A.length()==1||A.length()==2)
            return A;
        String res="";
        int arr[]=new int[1000000];
        for(int i=0;i<B;i++){
            int x=B-i;
            int y=2*(x-2)+2;
            int count=0;
            for(int j=i;j<A.length();j=j+y){
                res=res+Character.toString(A.charAt(j));
                arr[count]=j;
                count++;
            }
            for(int j=count-1;j>=0;j--){
                StringBuilder sb = new StringBuilder(A);
                sb.deleteCharAt(j);
                A=sb.toString();
            }
        }
        return res;
    }
}
