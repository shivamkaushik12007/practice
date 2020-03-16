import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n+1];
            int f=scanner.nextInt();
            int s=scanner.nextInt();
            // int frr[]=new int[n+1];
            ArrayList<ArrayList<Integer>> frr=new ArrayList<>();
            for(int i=0;i<=n;i++){
                ArrayList<Integer> temp=new ArrayList<>();
                frr.add(temp);
            }
            for(int i=0;i<f;i++){
                int k1=scanner.nextInt();
                int k2=scanner.nextInt();
                // frr[k1]=k2;
                frr.get(k1).add(k2);
            }
            for(int i=0;i<s;i++){
                dfs(scanner.nextInt(),arr,frr);
            }
            int cnt=0;
            for(int i=1;i<n+1;i++){
                if(arr[i]==1){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    public static void dfs(int n,int[] arr, ArrayList<ArrayList<Integer>>
    frr){
        if(arr[n]==1||n==0)
            return;
        arr[n]=1;
        for(int k:frr.get(n)){
            if(arr[k]!=1){
                dfs(k,arr,frr);
            }
            
        }
        

    }
}
