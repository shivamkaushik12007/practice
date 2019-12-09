
int singleNumber(const int* A, int n1) {
    int i=0;
    int num=A[0];
    for(i=1;i<n1;i++){
        num=num^A[i];
    }
    return num;
}
