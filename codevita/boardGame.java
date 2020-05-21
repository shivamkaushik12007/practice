import java.util.*;
import java.lang.*;
class BoardGame{
  static int max=Integer.MIN_VALUE;
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[][] arr=new int[n][n];
      for(int i=0;i<n;i++){
      	for(int j=0;j<n;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      int[][] vis=int[n][n];
      dfs(arr,n,0,0,0);
    System.out.println(max);
    }
  public static void(int[][] arr,int n,int sum,int i,int j){
    int temp=(int)Math.floor(sum/2);
      temp+=arr[i][j];
      if(i==n-1&&j==n-1&&temp>max)max=temp;
    if(i+1<n){
      dfs(arr,n,temp,i+1,j);
    }
    if(j+1<n){
      dfs(arr,n,temp,i,j+1);
    }
  }
}
