public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<A.size();i++){
            if(mp.get(A.get(i))==null){
                mp.put(A.get(i),1);
            }else{
                arr.add(A.get(i));
            }
            k+=A.get(i);
        }
        int n=A.size();
        k=k-arr.get(0);
        long l=(n*(n+1))/2;
        long k1=l>k?l:k;
        long k2=l<k?l:k;
        arr.add((int)(k1-k2));
        return arr;
    }
}
