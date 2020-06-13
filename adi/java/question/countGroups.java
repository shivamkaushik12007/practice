import java.util.*;
import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
	static int count=0;
    static int[] countGroups(int[][] m, int[] t) 
    {
		//complete this function
      Map<Integer,Integer> mp=new HashMap<>();
      int n1=m.length;
      int n2=m[0].length;
      int[][] vis=new int[n1][n2];
      for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
          if(vis[i][j]==0&&m[i][j]==1){
            count=0;
            check(m,vis,i,j,n1,n2);
            if(mp.get(count)==null){
              mp.put(count,1);
            }else{
              mp.put(count,mp.get(count)+1);
            }
          }
        }
      }
      int[] res=new int[t.length];
      for(int i=0;i<t.length;i++){
        res[i]=mp.get(t[i])==null?0:mp.get(t[i]);
      }
      return res;
    }
  static void check(int[][] arr,int[][] vis,int i,int j,int n,int m){
    count++;
    vis[i][j]=1;
    if(i-1>=0&&vis[i-1][j]==0&&arr[i-1][j]==1){
      check(arr,vis,i-1,j,n,m);
    }
    if(i+1<n&&vis[i+1][j]==0&&arr[i+1][j]==1){
      check(arr,vis,i+1,j,n,m);
    }
    if(j-1>=0&&vis[i][j-1]==0&&arr[i][j-1]==1){
      check(arr,vis,i,j-1,n,m);
    }
    if(j+1<m&&vis[i][j+1]==0&&arr[i][j+1]==1){
      check(arr,vis,i,j+1,n,m);
    }
  }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int r,c;
		r = sc.nextInt();
      	c= sc.nextInt();
      
		int [][] arr = new int[r][c];
		
		for(int i=0; i<r;i++)
		{
          for(int j=0; j<c;j++)
          {
            arr[i][j] = sc.nextInt();
          }
			
		}
      int q = sc.nextInt();
      int []t= new int[q];
      for(int i=0;i<q;i++)
        t[i] = sc.nextInt();
		
		sc.close();
      
      int []res = countGroups(arr, t);
      for(int i=0; i<q; i++)
      {
        System.out.println(res[i]);
      }
    }
}
