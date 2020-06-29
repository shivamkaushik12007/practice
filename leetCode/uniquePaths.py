class Solution:
    cnt=0
    def uniquePaths(self, m: int, n: int) -> int:
        arr=[]
        temp=[]
        for i in range(m):
            temp.append(0)
        for i in range(n):
            arr.append(temp)
        for i in range(m):
            arr[0][i]=1
        for i in range(n):
            arr[i][0]=1
        for i in range(1,n):
            for j in range(1,m):
                arr[i][j]=arr[i-1][j]+arr[i][j-1]
        return arr[n-1][m-1]
        # return int(((((m-1)*m)/2)*(n-2))+1+(m-1))
    #     if(m==1 or n==1):
    #         return 1
    #     for i in 
    #     self.dfs(0,0,m,n)
    #     return self.cnt
    # def dfs(self,i,j,n,m):
    #     if(i==n-1 and j==m-1):
    #         self.cnt+=1
    #         return
    #     if(i+1<n):
    #         self.dfs(i+1,j,n,m)
    #     if(j+1<m):
    #         self.dfs(i,j+1,n,m)
