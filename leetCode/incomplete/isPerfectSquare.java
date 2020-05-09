class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int l=1;
        int r=num/2;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            int k=mid*mid;
            if(k<0){
              r=mid-1;  
              continue;  
            } 
            if(k<num){
                l=mid+1;
            }else if(k>num){
                r=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
