class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=list()
        for i in range(0,len(nums)):
            temp=list()
            for j in range(i,len(nums)):
                temp1=list(temp)
                temp.append(nums[j])
                # if(not (temp in res)):
                #     print(temp)
                res.append(temp1)
        return res
        
