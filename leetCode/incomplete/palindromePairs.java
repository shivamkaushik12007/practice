class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<words.length-1;i++){
            String s=words[i];
            for(int j=i+1;j<words.length;j++){
                String s1=s+words[j];
                String s2=words[j]+s;
                if(check(s1)){
                    List<Integer> ss=new ArrayList<>();
                    ss.add(i);
                    ss.add(j);
                    arr.add(ss);
                }
                if(check(s2)){
                    List<Integer> ss=new ArrayList<>();
                    ss.add(j);
                    ss.add(i);
                    arr.add(ss);
                }
            }
        }
        return arr;
    }
    public boolean check(String s){
        int n=s.length();
        String s1=s.substring(0,n/2);
        String s2="";
        if(n%2==0){ 
            s2=s.substring(n/2,n);
            
        }else{
            s2=s.substring(n/2+1,n);
        }
        StringBuffer st=new StringBuffer(s2);
        st.reverse();
        if(s1.equals(st.toString())) return true;
        return false;
    }
}
