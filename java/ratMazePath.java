import java.util.*;
import java.lang.*;
public class Solution {
	static ArrayList<String> res=new ArrayList<>();
	public static void ratInAMaze(int maze[][]){
		int n=maze[0].length;
            check(maze,"",n,1,0,0);    
            for(int i=0;i<res.size();i++){
                String s=res.get(i);
                for(int j=1;j<=n*n;j++){
                    if(s.contains("-"+Integer.toString(j)+"-")){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
	}
    public static void check(int[][] maze,String s,int n,int l,int n1,int n2){
        String s1=s+"-"+Integer.toString(l)+"-";
        if(l==n*n){
            res.add(s1);
            return;
        }
        
        if(n1-1>=0&&maze[n1-1][n2]==1&&!s.contains("-"+Integer.toString(l-n)+"-")){
            check(maze,s1,n,l-n,n1-1,n2);
        }
        
        if(n1+1<n&&maze[n1+1][n2]==1&&!s.contains("-"+Integer.toString(l+n)+"-")){
            check(maze,s1,n,l+n,n1+1,n2);
        }
        if(n2-1>=0&&maze[n1][n2-1]==1&&!s.contains("-"+Integer.toString(l-1)+"-")){
            check(maze,s1,n,l-1,n1,n2-1);
        }
        
        if(n2+1<n&&maze[n1][n2+1]==1&&!s.contains("-"+Integer.toString(l+1)+"-")){
            check(maze,s1,n,l+1,n1,n2+1);
        }  
        return;
    }
	
	
}
