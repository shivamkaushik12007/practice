
int removeDuplicates(int* arr, int n1) {
    int i=0,j=1;
    int k=0;
    while(j<n1){
        if(arr[i]==arr[j]&&k==0){
            int temp=arr[i];
            i++;
            arr[i]=temp;
            j++;
            k++;
        }else if(arr[i]==arr[j]&&k==1){
            j++;
        }else if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
            j++;
            k=0;
        }
    }
    return i+1;
}
