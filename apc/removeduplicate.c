
int removeDuplicates(int* arr, int n1) {
    int i=0,j=1;
    while(j<n1){
        if(arr[i]==arr[j]){
            j++;
        }else if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
            j++;
        }
    }
    return i+1;
}
