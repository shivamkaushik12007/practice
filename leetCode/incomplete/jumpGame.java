class Solution {
    public boolean canJump(int[] nums) {
        return check(nums,nums.length-1);
    }
    public boolean check(int[] arr,int n){
        if(n==0) return true;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=n-i){
                if(check(arr,i)) return true;
            }
        }
        return false;
    }
}
