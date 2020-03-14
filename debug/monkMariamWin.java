import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            String s=scanner.next();
            int n=scanner.nextInt();
            int[] arr=new int[n];
            int sum=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
                if(arr[i]>sum){
                    sum=arr[i];
                }
            }
            for(int i=0;i<n-1;i++){
                int temp=arr[i];
                int k=1;
                for(int j=i;j<n-1;j++){
                    if(k%3==1){
                        temp=temp|arr[j+1];
                    }else if(k%3==2){
                        temp=temp^arr[j+1];
                    }else if(k%3==0){
                        temp=temp+arr[j+1];
                    }
                    if(temp>sum){
                        sum=temp;
                    }
                    k++;
                }
            }
            if((sum%2==0&&s.equals("Even"))||(sum%2==1&&s.equals("Odd"))){
                System.out.println("Monk");
            }else{
                System.out.println("Mariam");
            }
        }
    }
}
