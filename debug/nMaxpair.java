public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> ch=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            for(int j=0;j<B.size();j++){
                ch.add(A.get(i)+B.get(j));
            }
        }
        Collections.sort(ch,Collections.reverseOrder());
        while(ch.size()!=A.size()){
            ch.remove(A.size());
        }
        // for(int i=A.size()-1;i<ch.size();i++){
        //     ch.remove(A.size());
        // }
        // ArrayList<Integer> res=new ArrayList<>();
        // int n=ch.size()-1;
        // int k=0;
        // while(k<A.size()){
        //     res.add(ch.get(n));
        //     n--;
        //     k++;
        // }
        return ch;
    }
}
