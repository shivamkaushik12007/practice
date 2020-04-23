class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        int temp=1;
        while(temp==1){
            int k=0;
            while(n>0){
                k+=Math.pow(n%10,2);
                n/=10;
            }
            if(k==1)
                return true;
            if(arr.contains(k)){
                return false;
            }
            arr.add(k);
            n=k;
        }
        return false;
    }
}
