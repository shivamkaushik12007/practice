public class Solution {
    public int reverse(int x) {
        String s=Integer.toString(x);
        if(s.charAt(0)=='-')
            s=s.substring(1,s.length());
        StringBuilder s1=new StringBuilder(s);
        s1=s1.reverse();
        try{
        int t=Integer.parseInt(s1.toString());
        }catch(Exception e){
            return 0;
        }
        boolean b=x<0?false:true;
        int k=0;
        while(x!=0){
            int m=x%10;
            x=x/10;
            k=k*10+m;
        }
        if(!b){
            // System.out.println(b);
            int l=k*2;
            return l-k;
        }
        return k;
        
        
        // return k;
    }
}
