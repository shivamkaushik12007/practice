public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int l=a.size()/3;
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<a.size();i++){
            if(mp.get(a.get(i))==null){
                mp.put(a.get(i),1);
            }else{
                int k=mp.get(a.get(i));
                k=k+1;
                mp.put(a.get(i),k);
                if(k>=l){
                    return a.get(i);
                }
            }
        }
        return -1;
    }
}
