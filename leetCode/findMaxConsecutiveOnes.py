class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxOne=0
        sumOne=0
        for i in nums:
            if(i==0):
                sumOne=0
            else:
                sumOne+=1
            if(sumOne>maxOne):
                maxOne=sumOne
        return maxOne
