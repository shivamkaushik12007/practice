long listMax(int n, int operations_rows, int operations_columns, int** operations) {
    long* res=(long *)malloc(sizeof(long)*(n+2));
    for(int i=0;i<n+2;i++){
        res[i]=0;
    }
    for(int i=0;i<operations_rows;i++){
        res[operations[i][0]]+=operations[i][2];
        if(operations[i][1]<=n+1){res[operations[i][1]+1]-=operations[i][2];}
    } 
    long r=0;
    long max=LONG_MIN;
     for(int i=1;i<n+2;i++){
           r=r+res[i];
           if(r>max)
               max=r;
     }
    return max;
}
