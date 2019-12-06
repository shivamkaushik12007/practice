
 
int compare(const void * a, const void * b){ 
    return ( *(int*)a - *(int*)b ); 
}
 
void sortColors(int* arr, int n1) {
    int i=0,j=0;
    qsort((void*)arr, n1, sizeof(arr[0]), compare); 
    // for(i=0;i<n1;i++){
    //     for(j=0;j<n1;j++){
    //         if(arr[j]>arr[i]){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    // }
}
