class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        arr=list()
        for i in nums:
            if i in arr:
                return i
            else:
                arr.append(i)
        return -1
        
