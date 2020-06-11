class Solution {
    public void sortColors(int[] nums) {
        int k1=0,k2=0,k3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)k1++;
            if(nums[i]==1)k2++;
            if(nums[i]==2)k3++;
        }
        int i=0;
        while(i<k1){
            nums[i]=0;
            // System.out.print(i);
            i++;
        }
        while(i<k2+k1){
            nums[i]=1;
            // System.out.print(i);
            i++;
        }
        while(i<k3+k2+k1){
            nums[i]=2;
            // System.out.print(i);
            i++;
        }
    }
}
