import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    int V;
    LinkedList<LinkedList<Integer> > adj;
    boolean visited[];
    boolean cycle;
    Solution(int n)
    {
        this.V = n;
        adj = new LinkedList<LinkedList<Integer> >();
        visited = new boolean[n];
        for(int i=0;i<n;i++)
            adj.add( new LinkedList<Integer>()); 
    }
    
    void insert(int s, int e)
    {
        adj.get(s).add(e);
        adj.get(e).add(s);
    }
    
    boolean solve(){
        cycle=false;
        for(int i=0;i<this.V;i++){
            if(!visited[i]){
                dfs(i,-1);
            }
        }
        return cycle;
    }
    void dfs(int x,int parent){
        if(cycle)return;
        if(visited[x]&&x!=parent){
            cycle=true;
            return;
        }
        if(visited[x])return;
        visited[x]=true;
        for(int i:adj.get(x)){
            if(i!=parent)
                dfs(i,x);
        }
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
          int t= sc.nextInt();
           while(t != 0)
           {
               int a=sc.nextInt();
               int b=sc.nextInt();
               Solution so=new Solution(a);
               while(b != 0)
               {
                  so.insert(sc.nextInt(),sc.nextInt());
                  b--;
               }
               System.out.println(so.solve());
               t--;
           }
    }
}
        
import java.io.*;
import java.util.*;

class graph{
  int v;
  ArrayList<ArrayList<Integer>> arr;
  public graph(int n){
      this.v=n;
      arr=new ArrayList<>();
      for(int i=0;i<n;i++){
          arr.add(new ArrayList<Integer>());
      }
  }
  public void addEdge(int i,int j){
      arr.get(i).add(j);
      arr.get(j).add(i);
  }
  public void countComponents(){
      int[] vis=new int[this.v];
      int k=0;
      for(int i=0;i<this.v;i++){
          if(vis[i]==0){
              k++;
              dfs(vis,i);
          }
      }
      System.out.println(k);
  }
  public void dfs(int[] vis,int x){
      vis[x]=1;
      for(int i:arr.get(x)){
          if(vis[i]==0){
              dfs(vis,i);
          }
      }
  }
}

public class Solution {
    
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int TestCases=sc.nextInt();
        for(int i=0;i<TestCases;i++){
            graph obj =new graph(sc.nextInt());
            int edges=sc.nextInt();
            for(int k=0;k<edges;k++){
                obj.addEdge(sc.nextInt(),sc.nextInt());
            }
            obj.countComponents();   
        }
    }
}
