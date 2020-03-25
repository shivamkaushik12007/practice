public class Solution {
    
    public static void printJumpingNumbers(int n) {
        for(int i=0;i<=n;i++){
            if(i<11){
                System.out.print(i+" ");
            }else if(jumping(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean jumping(int k){
        int c=k%10;
        k/=10;
        while(k>0){
            int c1=k%10;
            k/=10;
            int k1=c-c1;
            if(!(k1==1||k1==-1)){
                return false;
            }
            c=c1;
        }
        return true;
    }
}
