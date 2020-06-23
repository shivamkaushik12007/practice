class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        arr=list()
        krr=list()
        for i in nums:
            if i in arr:
                if i in krr:
                    krr.remove(i)
            else:
                arr.append(i)
                krr.append(i)
        return krr[0]
