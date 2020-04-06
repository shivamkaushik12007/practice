import java.util.*;
import java.lang.*;
class Main{
    public static void main(String args[] ){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int s=scanner.nextInt();
        ArrayList<Map<Integer,Integer>> arr=new ArrayList<>();
        int[] a=new int[n];
        int[] path= new int[n];
        for(int i=0;i<n;i++){
            Map<Integer,Integer> temp=new HashMap<>();
            path[i]=Integer.MAX_VALUE;
            arr.add(temp);
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            int d=scanner.nextInt();
            n1--;
            n2--;
            arr.get(n1).put(n2,d);
            arr.get(n2).put(n1,d);
        }
        
        for(int i=0;i<n;i++){
            if(i!=s-1){
                int[] vis=new int[n];
                dfs(arr,s-1,i,0,vis,path);
            }
        }
        for(int i=0;i<n;i++){
            if(path[i]==Integer.MAX_VALUE){
                path[i]=0;
            }
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j&&path[i]!=0&&path[j]!=0&&i!=s-1&&j!=s-1){
                    sum+=(path[i]+path[j])*a[j];
                }else if(i!=s-1&&j==s-1){
                    sum+=path[i]*a[j];
                }else if(i==s-1&&j!=s-1){
                    sum+=path[j]*a[j];
                }
            }
            
            System.out.print(sum+" ");
        }
    }
    public static void dfs(ArrayList<Map<Integer,Integer>> arr,int s,int e,int sum,int[] vis,int[] path){
        if(s==e){
            if(sum<path[e]){
                path[e]=sum;
            }
            return;
        }
        if(vis[s]==1)
            return;
        vis[s]=1;
        for(Map.Entry<Integer,Integer> mp:arr.get(s).entrySet()){
            if(vis[mp.getKey()]==0){
                dfs(arr,mp.getKey(),e,sum+mp.getValue(),vis,path);
            }
        }
        vis[s]=0;
        return;
    }
}
