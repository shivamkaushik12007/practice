
int compare(const void * a, const void * b){ 
    return ( *(int*)a - *(int*)b ); 
} 
int* merge(int* A, int n1, int* B, int n2) {
    int n=n1+n2;
    int* arr=(int*)malloc(sizeof(int)*n);
    int i=0,j=0;
    int k=0;
    for(i=0;i<n;i++){
        if(i<n1){
            arr[i]=A[i];
        }else{
            arr[i]=B[i-n1];
        }
    }
        qsort((void*)arr, n, sizeof(arr[0]), compare); 
    // for(i=0;i<n;i++){
    //     for(j=0;j<n;j++){
    //         if(arr[i]<arr[j]){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    // }
    // while(i<n1&&j<n2){
    //     if(A[i]<B[j]){
    //         arr[k]=A[i];
    //         i++;
    //     }else if(A[i]>B[j]){
    //         arr[k]=B[j];
    //         j++;
    //     }else if(A[i]==B[i]){
    //         arr[k]=B[j];
    //         k++;
    //         arr[k]=A[i];
    //         i++;
    //         j++;
    //     }
    //     k++;
    // }
    // while(i<n1){
    //     arr[k]=A[i];
    //     i++;
    //     k++;
    // }
    // while(j<n2){
    //     arr[k]=B[j];
    //     j++;
    //     k++;
    // }
    
    return arr;
}
