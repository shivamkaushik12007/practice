import math
class Solution:
    num=1000000000000
    def numSquares(self, n: int) -> int:
        self.check(n,0)
        return self.num
    def check(self,n,res):
        if(n<0 or res>self.num):
            return
        if(n==0):
            if(res<self.num):
                self.num=res
            return
        p=int(math.sqrt(n))
        for i in reversed(range(1,p+1)):
            self.check(n-(i*i),res+1)
            if(n-(i*i)==0):
                break
