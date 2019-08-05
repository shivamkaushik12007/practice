public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=1234;
        int brr[]=new int[20];
        int i=0,a;
        while(n!=0){
            a=n%10;
            n=n/10;
            brr[i]=a;
            i++;
        }
        int arr[]=new int[i];
        for(int j=0;j<i;j++){
            arr[j]=brr[j];
        }
        for(int j=0;j<arr.length;j++){
            int count=0;
            for(int k=0;k<arr.length;k++){
                if(arr[j]==arr[k]){
                    count++;
                }
            }
            System.out.println("no. "+ arr[j]+" have "+count+"repeatance");
        }

    }
}
