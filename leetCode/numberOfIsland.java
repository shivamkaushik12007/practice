class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        if(row==0)return 0;
        int col=grid[0].length;
        int[][] vis=new int[row][col];
        int cnt=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(vis[i][j]==0&&grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,vis,i,j,row,col);
                    // System.out.println(i+" "+j);
                }
            }
        }
        return cnt;
    }
    public void dfs(char[][] grid,int[][] vis,int i,int j,int row,int col){
        // System.out.println(i+"check"+j);
        if(i-1>=0&&grid[i-1][j]=='1'&&vis[i-1][j]==0){
            vis[i-1][j]=1;
            dfs(grid,vis,i-1,j,row,col);
        }
        if(i+1<row&&grid[i+1][j]=='1'&&vis[i+1][j]==0){
            vis[i+1][j]=1;
            dfs(grid,vis,i+1,j,row,col);
        }
        if(j-1>=0&&grid[i][j-1]=='1'&&vis[i][j-1]==0){
            vis[i][j-1]=1;
            dfs(grid,vis,i,j-1,row,col);
        }
        if(j+1<col&&grid[i][j+1]=='1'&&vis[i][j+1]==0){
            vis[i][j+1]=1;
            dfs(grid,vis,i,j+1,row,col);
        }
    }
}
