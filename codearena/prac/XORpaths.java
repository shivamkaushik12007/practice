import java.util.*;
import java.lang.*;
class TestClass {
    static String res="";
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        ArrayList<Map<Integer,Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            Map<Integer,Integer> mp=new HashMap<>();
            arr.add(mp);
        }
        for(int i=0;i<n-1;i++){
            int k1=scanner.nextInt();
            int k2=scanner.nextInt();
            int k3=scanner.nextInt();
            k1--;
            k2--;
            arr.get(k1).put(k2,k3);
            arr.get(k2).put(k1,k3);
        }
        for(int i=0;i<q;i++){
            int k1=scanner.nextInt();
            int k2=scanner.nextInt();
            int k3=scanner.nextInt();
            k1--;
            k2--;
            res="";
            int[] vis=new int[n];
            dfs(k1,k2,res,vis,arr);
            String[] srr=res.split("-");
            int min=Integer.MIN_VALUE;
            for(int j=0;j<srr.length;j++){
                int klm=Integer.parseInt(srr[j])^k3;
                if(klm>min){
                    min=klm;
                }
            }
            System.out.println(min);
        }
    }
    public static void dfs(int k1,int k2,String s,int[] vis,ArrayList<Map<Integer,Integer>> arr){
        if(k1==k2){
            res=s;
            return;
        }
        if(vis[k1]==1) return;
        vis[k1]=1;
        for(Map.Entry<Integer,Integer> l:arr.get(k1).entrySet()){
            String s1=s+Integer.toString(l.getValue())+"-";
            dfs(l.getKey(),k2,s1,vis,arr);
        }
    }
}
