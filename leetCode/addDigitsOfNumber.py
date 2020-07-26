class Solution:
    def addDigits(self, num: int) -> int:
        if(num//10==0):
            return num
        numSum=0
        while(not num==0):
            numSum+=num%10
            num=num//10
        return self.addDigits(numSum)
