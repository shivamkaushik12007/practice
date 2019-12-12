
 int check(const int* arr,int l,int r,int s){
     int mid=(l+r)/2;
     while(l<r){
         if(arr[mid]==s){
            return mid; 
         }else if(arr[mid]<s){
             l=mid+1;
         }else{
             r=mid;
         }
         mid=(l+r)/2;
     }
     return -1;
 }
 
int search(const int* arr, int n1, int B) {
    int k=arr[0];
    int l=0;
    int r=n1;
    int mid=(l+r)/2;
    while(l<r){
        if(arr[mid]<k){
            r=mid;
        }else{
            l=mid+1;
        }
        mid=(l+r)/2;
    }
    int k1=check(arr,0,mid,B);
    int k2=check(arr,mid,n1,B);
    return k1!=-1?k1:k2;
}
