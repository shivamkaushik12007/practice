class Solution {
    int res=Integer.MAX_VALUE;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        for(int i=0;i<n;i++){
            if(flights[i][0]==src){
                // System.out.println(i);
                int[] vis=new int[n];
                vis[src]=1;
                dfs(flights,vis,flights[i][1],dst,k,n,0,flights[i][2]);
            }
        }
        if(res==Integer.MAX_VALUE)return -1;
        return res;
    }
    public void dfs(int[][] flights,int[] vis,int src,int dst,int k,int n,int kSum,int nSum){
        // System.out.println("src "+src);
        if(kSum>k)return;
        // System.out.println("src "+src);
        if(src==dst){
            // System.out.println("src "+src);
            if(kSum<=k&&nSum<res){
                // System.out.println(nSum);
                res=nSum;
            }
                
            return;
        }
        // System.out.println("src "+src);
        vis[src]=1;
        for(int i=0;i<n;i++){
            // System.out.println("src "+src+" i"+i+"vis"+vis[flights[0][1]]);
            if(flights[i][0]==src&&vis[flights[i][1]]==0){
                
                dfs(flights,vis,flights[i][1],dst,k,n,kSum+1,nSum+flights[i][2]);
            }
        }
        
    }
}
