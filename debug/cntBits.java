public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        int sum=0;
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                int k=check(A.get(i),A.get(j));
                sum+=k;
            }
        }
        return sum*2;
    }
    public int check(int k1,int k2){
        int j=0;
        int sum=0;
        while(k1>0||k2>0){
            // int l1=k%2;
            int l2=k1%2;
            int l3=k2%2;
            if(l2!=l3){
                sum++;
            }
            j++;
            // System.out.println(l2+" "+l3+" "+sum+" "+k1+" "+k2);
            k1=k1/2;
            k2=k2/2;
        }
        return sum;
    }
}
