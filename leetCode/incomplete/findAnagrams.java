class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int l1=p.length();
        int l2=s.length();
        int i=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(l1<=l2){
            if(check(s.substring(i,l1),p)){
                arr.add(i);
            }
            i++;
            l1++;
        }
        return arr;
    }
    public boolean check(String s1,String s2){
        for(int i=0;i<s2.length();i++){
            int k=s1.indexOf(s2.charAt(i));
            if(k==-1) return false;
            if(k==0){
                s1=s1.substring(1,s1.length());
            }else if(k==s1.length()-1){
                s1=s1.substring(0,s1.length()-1);
            }else{
                s1=s1.substring(0,k)+s1.substring(k+1,s1.length());
            }
        }
        return true;
    }
}
