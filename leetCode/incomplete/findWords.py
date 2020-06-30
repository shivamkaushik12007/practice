class Solution:
    check=False
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        res=[]
        for i  in words:
            for j in range(len(board)):
                if(i[0] in board[j]):
                    for k in range(len(board[j])):
                        if(board[j][k]==i[0]):
                            self.check=False
                            vis=[[0 for l in range(len(board[0]))] for m in range(len(board))]
                            self.dfs(board,vis,i[1:len(i)],j,k,len(board),len(board[0]))
                            if(self.check and i not in res):
                                res.append(i)
        return sorted(res)
    def dfs(self,board,vis,s,i,j,n,m):
        # print(i,j)
        # print(vis)
        if(self.check):
            return
        if(len(s)==0):
            self.check=True
            return
        vis[i][j]=1
        k=s[0]
        if(i+1<n and board[i+1][j]==k and vis[i+1][j]==0):
            self.dfs(board,vis,s[1:len(s)],i+1,j,n,m)
        if(i-1>=0 and board[i-1][j]==k and vis[i-1][j]==0):
            self.dfs(board,vis,s[1:len(s)],i-1,j,n,m)
        if(j+1<m and board[i][j+1]==k and vis[i][j+1]==0):
            self.dfs(board,vis,s[1:len(s)],i,j+1,n,m)
        if(j-1>=0 and board[i][j-1]==k and vis[i][j-1]==0):
            self.dfs(board,vis,s[1:len(s)],i,j-1,n,m)
        vis[i][j]=0
                        
        
