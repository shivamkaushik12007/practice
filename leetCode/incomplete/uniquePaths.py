class Solution:
    cnt=0
    def uniquePaths(self, m: int, n: int) -> int:
        # return int(((((m-1)*m)/2)*(n-2))+1+(m-1))
        self.dfs(0,0,m,n)
        return self.cnt
    def dfs(self,i,j,n,m):
        if(i==n-1 and j==m-1):
            self.cnt+=1
            return
        if(i+1<n):
            self.dfs(i+1,j,n,m)
        if(j+1<m):
            self.dfs(i,j+1,n,m)
