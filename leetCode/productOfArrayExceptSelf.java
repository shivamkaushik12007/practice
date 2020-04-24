class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=1;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                n*=nums[i];   
            }else{
                z+=1;
            }
            
        }
        // int p=z;
        for(int i=0;i<nums.length;i++){
            if(z==0){
                nums[i]=n/nums[i];    
            }else{
                if(z==1&&nums[i]==0){
                    nums[i]=n;
                }else{
                    nums[i]=0;
                }
            }
            
        }
        return nums;
    }
}
