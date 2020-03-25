import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String temp=scanner.next();
            if(!arr.contains(temp))
                arr.add(temp);
        }
        int c=arr.size();
        int[][] brr=new int[c][c];
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    int temp=scanner.nextInt();
                }else if(brr[i][j]==0){
                    brr[i][j]=scanner.nextInt();
                    brr[j][i]=brr[i][j];
                }else{
                    int temp=scanner.nextInt();
                }
                
            }
        }
        int k=0;
        int l=scanner.nextInt();
        int res=0;
        for(int i=0;i<l;i++){
            String p=scanner.next();
            int p1=arr.indexOf(p);
            if(p1!=-1){
                res+=brr[k][p1];
                k=p1;
            }
            
        }
        System.out.println(res);
    }
}
