import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int pro[]=new int[n];
            int con[]=new int[n];
            int sumC=0;
            int sumP=0;
            for(int i=0;i<n;i++){
                pro[i]=scanner.nextInt();
                con[i]=scanner.nextInt();
                sumC+=con[i];
                sumP+=pro[i];
            }
            int min=Integer.MIN_VALUE;
            // for(int i=0;i<n-1;i++){
            //     for(int j=i+1;j<n;j++){
            //         int k=pro[i]+pro[j];
            //         int l=sumC-con[i]-con[j];
            //         int total=k-l;
            //         if(min<total){
            //             min=total;
            //         }
            //     }
            // }
            if(n<=2){
                System.out.println(sumP);
            }else{
                int k1=0;
                int k2=1;
                min=pro[0]+pro[1]-sumC+con[0]+con[1];
                int j=2;
                while(j<n){
                    int temp1=pro[k1]+pro[j]-sumC+con[k1]+con[j];
                    int temp2=pro[k2]+pro[j]-sumC+con[k2]+con[j];
                    if(min<temp1&&min<temp2){
                        int t2=temp1>temp2?k1:k2;
                        k1=t2;
                        k2=j;
                        min=temp1>temp2?temp1:temp2;
                    }else if(min<temp1){
                        min=temp1;
                        k2=j;
                    }else if(min<temp2){
                        min=temp2;
                        k1=k2;
                        k2=j;
                    }
                    j++;
                }
                System.out.println(min);
            }
            
        }
    }
}
