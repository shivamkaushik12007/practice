class Solution:
    def dfs(self,res,temp,i,n,graph):
        temp.append(i)
        if(i==n):
            res.append(temp)
            return
        for j in graph[i]:
            self.dfs(res,temp,j,n,graph)
            temp=temp[0:temp.index(i)+1]
        
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        res=list()
        for i in graph[0]:
            temp=list()
            temp.append(0)
            self.dfs(res,temp,i,len(graph)-1,graph)
        return res
