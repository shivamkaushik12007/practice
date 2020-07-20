class Solution:
    def addBinary(self, a: str, b: str) -> str:
        a1=int(a,2)
        b1=int(b,2)
        res=a1+b1
        return "{0:b}".format(res)
