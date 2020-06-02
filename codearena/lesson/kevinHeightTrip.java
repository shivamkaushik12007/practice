import java.util.*;

class TestClass {
    public static int max=Integer.MIN_VALUE;
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            max=Integer.MIN_VALUE;
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int[] h=new int[n];
            ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                ArrayList<Integer> temp=new ArrayList<>();
                arr.add(temp);
                h[i]=scanner.nextInt();
            }
            for(int i=0;i<m;i++){
                int k1=scanner.nextInt();
                int k2=scanner.nextInt();
                k1--;
                k2--;
                arr.get(k1).add(k2);
            }
            for(int i=0;i<n;i++){
                int[] vis=new int[n];
                dfs(arr,vis,h[i],i,h);
            }
            System.out.println(max);
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> arr,int[] vis,int height,int x,int[] h){
        if(x>vis.length)return;
        if(h[x]-height>max){
            max=h[x]-height;
        }
        vis[x]=1;
        for(int i:arr.get(x)){
            if(vis[i]==0){
                dfs(arr,vis,height,i,h);
            }
        }
    }
}
