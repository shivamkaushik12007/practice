class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(i==j){
                    cnt+=nums[i]==k?1:0;
                }else{
                    cnt+=sum[j]-sum[i]+nums[i]==k?1:0;
                }
            }
        }
        return cnt;
    }
}
