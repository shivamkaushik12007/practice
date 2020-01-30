public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int n=A.size();
        int am[]=new int[n];
        for(int i=0;i<n;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            if(am[i]==0){
            arr.add(i+1);
            for(int j=i+1;j<n;j++){
                int k=check(A.get(i),A.get(j));
                if(k==1){
                    am[j]=1;
                    arr.add(j+1);
                }
                    
            }
            // if(arr.size()>1)
                res.add(arr);
                am[i]=1;
            }
        }
        
        return res;
    }
    public int check(String a,String b){
        String a1=new String(a);
        String a2=new String(b);
        char ch1[]=a1.toCharArray();
        char ch2[]=a2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1=new String(ch1);
        String s2=new String(ch2);
        if(s1.equals(s2))
            return 1;
        return 0;
    }
}
