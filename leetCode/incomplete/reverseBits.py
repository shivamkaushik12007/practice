class Solution:
    def reverseBits(self, n: int) -> int:
        res="{0:b}".format(n)
        # res=res[::-1]
        print(res)
        print(res[::-1])
        return int(res, 2)
