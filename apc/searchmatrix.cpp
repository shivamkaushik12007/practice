int Solution::searchMatrix(vector<vector<int> > &A, int B) {
    
    int n=0;
    if(B<A[0][0]){
        return 0;
    }
    int count=0;
    for(int i=0;i<A.size();i++){
        if(B==A[i][0]){
            return 1;
        }else if(B<A[i][0]){
            break;
        }
        count++;
    }
    n=count-1;
    int l=0,r=A[0].size()-1;
    int mid=0;
    while(l<=r){
        mid=(l+r)/2;
        if(A[n][mid]==B){
            return 1;
        }else if(A[n][mid]>B){
            r=mid-1;
        }else{
            l=mid+1;
        }
    }
    return 0;
}

