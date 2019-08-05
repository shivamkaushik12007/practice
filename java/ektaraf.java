public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]=new int[]{11,-1,2,-2};
        int n=arr.length;
        int brr[]=new int[20];
        int crr[]=new int[20];
        int drr[]=new int[20];
        int k=0,l=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                brr[k]=arr[i];
                k++;
            }else{
                crr[l]=arr[i];
                l++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<k){
                drr[i]=brr[i];
            }else{
                drr[i]=crr[i-k];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(drr[i]);
        }

    }
}
