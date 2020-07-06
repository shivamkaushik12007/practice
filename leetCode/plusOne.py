class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        k=0
        for i in digits:
            k=k*10+i
        k+=1
        m=list(str(k))
        return list(map(int,m))
        
