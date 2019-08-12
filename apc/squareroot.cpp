int Solution::sqrt(int A) {
        int l=1,r=A;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(mid==A/mid){
                return mid;
            }else if(mid>A/mid){
                r=mid-1;
            }else if(mid<A/mid){
                l=mid+1;
            }
        }
        return r;
}

