class Solution {
    public int search(int[] nums, int target) {
        return check(nums,target,0,nums.length);
    }
    public int check(int[] arr,int n,int l,int r){
        if(l>=r) return -1;
        if(arr[(l+r)/2]==n) return (l+r)/2;
        int k1=check(arr,n,l,(l+r)/2);
        int k2=check(arr,n,(l+r)/2+1,r);
        if(k1==-1&&k2==-1){
            return -1;
        }else{
            return k1==-1?k2:k1;
        }
    }
}
