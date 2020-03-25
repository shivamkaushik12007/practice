class Solution{
    public static void bittobyte(int n){
        if(n<3){
            System.out.println("1 0 0");
        }else if(n<11){
            System.out.println("0 1 0");
        }else if(n<26){
            System.out.println("0 0 1");
        }else{
            int k=n/26;
            int m=n%26;
            long c=(long)Math.pow(2,k);
            if(m<3){
                // System.out.println(m);
                System.out.println(c+" 0 0");
            }else if(m<11){
                // System.out.println(m);
                System.out.println("0 "+c+" 0");
            }else if(m<26){
                System.out.println("0 0 "+c);
            }
        }
        
    }
}
