
int searchInsert(int* arr, int n1, int B) {
    int l=0,r=n1;
    int mid=(l+r)/2;
    while(l<r){
        if(arr[mid]<B){
            l=mid+1;
        }else{
            r=mid;
        }
        mid=(l+r)/2;
    }
    return mid;
    // for(i=0;i<n1;i++){
    //     if(arr[i]>=B)
    //         return i;
    // }
}
