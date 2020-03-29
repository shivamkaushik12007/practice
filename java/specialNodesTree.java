import java.util.*;
import java.lang.*;
class TestClass {
    static int cnt=0;
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> kemp=new ArrayList<>();
            arr.add(kemp);
        }
        for(int i=0;i<n-1;i++){
            if(i>0){
                arr.get(0).add(i);
            }
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            if(!arr.get(n1-1).contains(n2-1))
            arr.get(n1-1).add(n2-1);
        }
        int[] clr=new int[n];
        int[] special=new int[n];
        for(int i=0;i<n;i++){
            clr[i]=scanner.nextInt();
        }
        int q=scanner.nextInt();
        while(q-->0){
            int temp=scanner.nextInt();
            dfs(temp-1,clr[temp-1],arr,clr,special);
            System.out.println(cnt);
        }
        cnt=0;
    }
    public static void dfs(int k,int c,ArrayList<ArrayList<Integer>> arr,int[] clr,int[] special){
        if(special[k]==1&&clr[k]==c){
            return;
        }
        if(special[k]==0&&clr[k]==c){
            special[k]=1;
            cnt++;
        }
        // if((special[k]==1&&clr[k]!=c)||(special[k]==0&&clr[k]==c)||(special[k]==0&&clr[k]!=c)){
            try{
                // if(!(special[k]==1&&clr[k]==c)){
                for(int p:arr.get(k)){
                        dfs(p,c,arr,clr,special);
                }
                // }
            }catch(Exception e){
                return;
            }
        // }
        return;
    }
}
