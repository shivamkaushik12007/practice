class Solution{
    public static void israinbow(int [] arr){
        // Write your code here
        int n=arr.length;
        String s1="";
        String s2="";
        int cnt=1;
        for(int i=0;i<=n/2;i++){
            s1+=Integer.toString(arr[i]);
            s2+=Integer.toString(arr[n-1-i]);
            if(arr[i]==cnt){
                cnt++;
            }else if(arr[i]>cnt){
                cnt=10;
                break;
            }
        }
        // System.out.println(s1+" "+s2+" "+cnt);
        if(s1.equals(s2)&&cnt==8){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
