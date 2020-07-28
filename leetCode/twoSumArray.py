class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res=list()
        for i in range(len(nums)):
            if(target-nums[i] in nums[i+1:len(nums)]):
                res.append(i)
                res.append(nums.index(target-nums[i],i+1))
                break
        return res
            
