import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.next();
            }
            System.out.println(check(arr,n));
        }
    }
    public static String check(String[] arr,int n){
       int[] arr1=new int[n];
       int[] arr2=new int[n];
       int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i].charAt(j)=='#'){
                    arr1[i]++;
                    arr2[j]++;
                    cnt++;
                }
            }
        }
		int cherries_above = 0;
		for (int i = 0; i < n; ++i)
		{
			cherries_above+=arr1[i];
			if(2*cherries_above == cnt)
				return "YES";
		}
		int cherries_left = 0;
		for (int i = 0; i < n; ++i)
		{
			cherries_left+=arr2[i];
			if(2*cherries_left == cnt)
                return "YES";
		}
        return "NO";

    }
}
