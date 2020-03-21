import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        if(t>=1&&t<=12){
        while(t-->0){
            int n=scanner.nextInt();
            if(n<1||n>100000){
                break;
            }
            int k=scanner.nextInt();
            if(k<0||k>n){
                break;
            }
            String s=scanner.next();
            int res=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                int temp=k;
                int cnt=0;
                String l=s.substring(i,i+1);
                for(int j=i;j<n;j++){
                    if(l.equals(s.substring(j,j+1))){
                        cnt++;
                    }else if(temp>0){
                        cnt++;
                        temp--;
                    }else{
                        break;
                    }
                }
                if(res<cnt){
                    res=cnt;
                }
            }
            System.out.println(res);
        }}
    }
}
