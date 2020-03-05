   static void checkString(String s)
    {
        int v=0;
        int c=0;
        String b="aeiouAEIOU";
        //Your code here
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1>='a'&&c1<='z'||c1>='A'&&c1<='Z'){
                if(b.contains(s.substring(i,i+1))){
                    v++;
                }else{
                    c++;
                }    
            }
        }
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
        
        System.out.println();
    }
}
