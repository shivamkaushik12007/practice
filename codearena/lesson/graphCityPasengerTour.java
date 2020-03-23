import java.util.*;
import java.lang.*;
class TestClass {
    Map<String,Integer> res=new HashMap<>();
    int resMin=Integer.MIN_VALUE;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        ArrayList<Map<Integer,Integer>> arr=new ArrayLIst<>(n);
        for(int i=0;i<r;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            arr.get(n1).put(n2,n3);
            arr.get(n2).put(n1,n3);
        }
        int s=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int vis[]=new int[n];
        dfs(s,d,arr,vis,Integer.MAX_VALUE,"");
        ArrayList<String> result=new ArrayList<>();
        for(Map.entry<String,Integer> entry:res.entrySet()){
            if(mp.getValue()==resMin){
                result.add(mp.getKey());
            }
        }
        Collections.sort(result);
        String ress=result.get(0);
        for(int i=0;i<ress.length();i++){
            System.out.print(ress.charAt(i)+" ");
        }
        System.out.println();
        int resNum=res.get(ress);
        int get=p/resNum;
        if(get>resMin){
            get+=get/resNum;
        }
        System.out.println(get);
    }
    public static void dfs(int s,int d,ArrayList<Map<Integer,Integer>> arr,int[] vis,int min,String si){
        si+=Integer.toString(s);
        if(s==d){
            res.put(si,min);
            if(min<resMin){
                resMin=min;
            }
            return;
        }
        if(vis[s]!=1){
            vis[s]=1;
            for(Map.entry<Integer,Integer> mp:arr.get(s).entrySet()){
                if(mp.getValue()<min){
                    dfs(mp.getKey(),d,arr,vis,mp.getValue(),si);
                }else{
                    dfs(mp.getKey(),d,arr,vis,min,si);
                }
            }
        }
    }
}
