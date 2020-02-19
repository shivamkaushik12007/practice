//to find the biggest cycle inthe graph
import java.io.*;
import java.util.*;
class Main {
    public static int res=Integer.MIN_VALUE;
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int k=scanner.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<k;i++){
                arr.add(scanner.nextInt());
            }
            int res1=Integer.MIN_VALUE;
            for(int lump=0;lump<arr.size();lump++){
                int[] vis=new int[k];
                res=Integer.MIN_VALUE;
                dfs(arr,vis,lump,0,lump);
                if(res>res1){
                    res1=res;
                }
            }
            if(res1==Integer.MIN_VALUE){
                System.out.println("-1");    
            }else{
                System.out.println(res1);
            }
            
        }
    }
    public static void dfs(ArrayList<Integer> arr,int[] vis,int index,int sum,int parent){
        if(index>=arr.size()){
            return;
        }
        if(vis[index]==0){
            if(arr.get(index)==-1){
                return;
            }
            sum+=index;
            vis[index]=1;
            dfs(arr,vis,arr.get(index),sum,parent);
        }else if(index==parent){
            if(sum>res){
                res=sum;
                return;
            }
        }else{
            return;
        }
    }
}
