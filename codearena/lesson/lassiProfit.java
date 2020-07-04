import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int[][] res=new int[n+1][n+1];
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    // if(j%n==0){
                        int k1=res[i-1][j-i];
                        int k2=res[i][j-i];
                        res[i][j]=k1>k2?k1:k2;
                        res[i][j]+=arr[i-1];
                        res[i][j]=res[i][j]>res[i-1][j]?res[i][j]:res[i-1][j];
                    // }else{

                    // }
                }
            }
            System.out.println(res[n][n]);
        }

    }
}
