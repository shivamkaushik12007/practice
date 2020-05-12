class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] vis=new int[image.length][image[0].length];
        dfs(image,sr,sc,newColor,vis,image.length,image[0].length);
        return image;
    }
    public void dfs(int[][] arr,int i,int j,int k,int[][] vis,int x,int y){
        vis[i][j]=1;
        if(i-1>=0&&arr[i-1][j]==arr[i][j]&&vis[i-1][j]==0){
            dfs(arr,i-1,j,k,vis,x,y);
        }
        if(i+1<x&&arr[i+1][j]==arr[i][j]&&vis[i+1][j]==0){
            dfs(arr,i+1,j,k,vis,x,y);
        }
        if(j-1>=0&&arr[i][j-1]==arr[i][j]&&vis[i][j-1]==0){
            dfs(arr,i,j-1,k,vis,x,y);
        }
        if(j+1<y&&arr[i][j+1]==arr[i][j]&&vis[i][j+1]==0){
            dfs(arr,i,j+1,k,vis,x,y);
        }
        arr[i][j]=k;
    }
}
