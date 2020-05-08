class Solution {
    public int findComplement(int num) {
        int i=0;
        int res=0;
        while(num>0){
            if(num%2==0){
                res+=Math.pow(2,i);
            }
            num=num/2;
            i++;
        }
        return res;
    }
}
