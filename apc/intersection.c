
int* intersect(const int* A, int n1, const int* B, int n2, int *len1) {
    int n=n1<n2?n1:n2;
    int* arr=(int*)malloc(sizeof(int)*n);
    int size=0;
    int i=0,j=0;
    while(i<n1&&j<n2){
        if(A[i]==B[j]){
            arr[size]=A[i];
            size++;
            i++;
            j++;
        }else if(A[i]!=B[j]&&A[i]<B[j]){
            i++;
        }else if(A[i]!=B[j]&&A[i]>B[j]){
            j++;
        }
    }
    *len1=size;
    return arr;
}
