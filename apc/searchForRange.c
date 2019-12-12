
int* searchRange(const int* arr, int n1, int b, int *len1) {
    int* arr1=(int*)malloc(sizeof(int));
    if(n1==1&&arr[0]==b){
        *len1=2;
        arr1[0]=0;
        arr1[1]=0;
        return arr1;
    }
    int count=0,count1=0;
    *len1=2;
    int l=0,r=n1;
    int l1=0,r1=n1;
     int mid=(l+r)/2;
     int mid1=mid;
     while(l<r){
         if(arr[mid1]<b){
             l=mid1+1;
         }else{
             r=mid1;
             if(arr[mid1]==b)
                count++;
         }
         mid1=(l+r)/2;
     }
     while(l1<r1){
         if(arr[mid]<=b){
             l1=mid+1;
             if(arr[mid]==b)
                count1++;
         }else{
             r1=mid;
         }
         mid=(l1+r1)/2;
     }
    // int k1=upper(A,n1,B);
    // int k2=lower(A,n1,B);
    if(count==0){
        arr1[0]=-1;
        arr1[1]=-1;
        return arr1;
    }
    arr1[0]=mid1;
    arr1[1]=mid-1;
    return arr1;
}
