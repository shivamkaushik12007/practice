 public static String mergeStrings(String a, String b) {
    // Write your code here
        int k1=a.length();
        int k2=b.length();
        String res="";
        int n=k1<k2?k1:k2;
        for(int i=0;i<n;i++){
            String s1=Character.toString(a.charAt(0));
            String s2=Character.toString(b.charAt(0));
            res=res+s1+s2;
            a=a.substring(1,a.length());
            b=b.substring(1,b.length());
        }
        if(a.length()>0){
            res+=a;
        }else if(b.length()>0){
            res+=b;
        }
        return res;
    }
