import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int m=s.nextInt();
            int q=s.nextInt();
            int[][] arr=new int[n][m];
            int[][] brr=new int[q][2];
            for(int i=0;i<q;i++){
                int x=s.nextInt();
                int y=s.nextInt();
                x--;
                y--;
                arr[x][y]=1;
                brr[i][0]=x;
                brr[i][1]=y;
            }
            int cnt=0;
            for(int i=0;i<q;i++){
                int t1=brr[i][0]+2,v1=brr[i][1]+1;
                int t2=t1,v2=v1-2;
                int t3=brr[i][0]+1,v3=brr[i][1]+2;
                int t4=t3-2,v4=v3;
                if(t1>=0&&t1<n&&v1>=0&&v1<m&&arr[t1][v1]==1){
                    cnt+=2;
                }
                if(t2>=0&&t2<n&&v2>=0&&v2<m&&arr[t2][v2]==1){
                    cnt+=2;
                }
                if(t3>=0&&t3<n&&v3>=0&&v3<m&&arr[t3][v3]==1){
                    cnt+=2;
                }
                if(t4>=0&&t4<n&&v4>=0&&v4<m&&arr[t4][v4]==1){
                    cnt+=2;
                }
            }
            // int res=(int)Math.pow(2,cnt);
            System.out.println(cnt);
            
        }
    }
}
