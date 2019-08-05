
public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]=new int[]{1,2,3,4,5,6,2,4,5};
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>-1){
                System.out.println(arr[i]);
            }
        }
    }
}
