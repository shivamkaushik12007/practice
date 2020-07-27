class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for i in nums:
            num=i
            c=0
            while(num>0):
                num//=10
                c+=1
            if(c%2==0):
                count+=1
        return count
