//epam wala code yaha aega!
class Solution{
  public static int solve(int[] arr){
    int n=arr.length;
    int n1=n/2;
    int n2=n/2;
    if(n%2!=0){
      n1+=1;
    }
    int[] a1=new int[n1];
    int[] a2=new int[n2];
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        a1[arr[i]+1/2]=1;
      }else{
        a2[arr[i]/2-1]=1;
      }
    }
    int cnt=0;
    for(int i=0;i<n1-1;i++){
      if(a1[i]==a2[i]==0)
        cnt++;
      if(a1[i]==a1[i+1]==0)
        cnt++;
    }
    
    for(int i=0;i<n2-1;i++){
      if(a2[i]==a2[i+1]==0)
        cnt++;
    }
    if(n%2==0&&a1[n1-2]==a1[n1-1]==0)
      cnt++;
    return cnt;
  }
}

