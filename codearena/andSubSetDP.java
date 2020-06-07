import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int z=s.nextInt();
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();   
            }
            if(check(z,n,arr)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    
    public static boolean check(int z,int n,int[] arr){
        for(int i=0;i<n;i++){
            int k=z&arr[i];
            z=k<z?k:z;
            if(z==0) return true;
        }
        return false;
    }
}
