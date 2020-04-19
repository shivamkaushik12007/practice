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




























import java.util.*;
import java.lang.*;
class TestClass {
    static Map<String,Integer> res=new HashMap<>();
    static int resMin=Integer.MIN_VALUE;
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        ArrayList<Map<Integer,Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            Map<Integer,Integer> temp=new HashMap<>();
            arr.add(temp);
        }
        for(int i=0;i<r;i++){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            n1--;
            n2--;
            arr.get(n1).put(n2,n3);
            arr.get(n2).put(n1,n3);
        }
        int s=sc.nextInt();
        int d=sc.nextInt();
        s--;
        d--;
        int p=sc.nextInt();
        int vis[]=new int[n];
        dfs(s,d,arr,vis,Integer.MAX_VALUE,"");
        ArrayList<String> result=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:res.entrySet()){
            if(entry.getValue()==resMin){
                result.add(entry.getKey());
            }
        }
        // System.out.println(resMin);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(0));
        }
        Collections.sort(result);
        String ress=result.get(0);
        System.out.println(result.get(0));
        int i=0;
        while(i<ress.length()){
            int k=ress.indexOf('-',i);
            System.out.print((Integer.parseInt(ress.substring(i,k))+1)+" ");
            i=k+1;
        }
        System.out.println();
        int resNum=res.get(ress);
        int get=p/resNum;
        // System.out.println(get+" "+resNum+" "+p);
        if(p%resNum>0){
            get++;
        }
        p+=get;
        get=p/resNum;
        // System.out.println(get+" "+resNum+" "+p);
        if(p%resNum>0){
            get++;
        }
        if(get>resMin){
            get+=get/resNum;
        }
        
        System.out.println(get);
    }
    public static void dfs(int s,int d,ArrayList<Map<Integer,Integer>> arr,int[] vis,int min,String si){
        si=si+Integer.toString(s)+"-";
        if(s==d){
            // System.out.println("result"+min);
            res.put(si,min);
            if(min>resMin){
                resMin=min;
            }
            return;
        }
        if(vis[s]!=1){
            vis[s]=1;
            for(Map.Entry<Integer,Integer> mp:arr.get(s).entrySet()){
                // System.out.println(mp.getKey()+" "+mp.getValue()+" "+min);
                if(mp.getValue()<min){
                    dfs(mp.getKey(),d,arr,vis,mp.getValue(),si);
                }else{
                    dfs(mp.getKey(),d,arr,vis,min,si);
                }
            }
        }
    }
}
