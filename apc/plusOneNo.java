public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry=1;
        for(int i=A.size()-1;i>=0;i--){
            int k=A.get(i);
            k=k+carry;
            int m1=k%10;
            k=k/10;
            int m2=k;
            A.set(i,m1);
            carry=m2;
        }
        
        if(carry>0){
            A.add(0,carry);
        }
        while(A.get(0)==0){
            A.remove(0);
        }
        return A;
    }
}
