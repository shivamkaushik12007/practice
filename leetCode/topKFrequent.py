class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        arr=dict()
        for i in nums:
            if(arr.get(i,-1)==-1):
                arr[i]=1
            else:
                arr[i]+=1
        arr=sorted(arr.items(), key=lambda x: x[1],reverse=True)
        temp=list(arr)
        res=list()
        for i in range(k):
            res.append(temp[i][0])
        return res
