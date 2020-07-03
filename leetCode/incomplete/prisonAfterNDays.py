class Solution:
    def prisonAfterNDays(self, cells: List[int], N: int) -> List[int]:
        if N==0:
            return cells
        for _ in range(N):
            temp=[]
            temp.append(0)
            for i in range(1,7):
                if(cells[i-1]==cells[i+1]):
                    temp.append(1)
                else:
                    temp.append(0)
            temp.append(0)
            cells=temp
        return cells
