
int removeElement(int* A, int n1, int B) {
    int i=0,cnt=0,j=0;
    int* arr=(int*)malloc(sizeof(int)*n1);
    for(i=0;i<n1;i++){
        if(A[i]==B){
            cnt++;
        }else{
            arr[j]=A[i];
            j++;
        }
    }
    for(i=0;i<n1-cnt;i++){
        A[i]=arr[i];
    }
    return n1-cnt;
}
