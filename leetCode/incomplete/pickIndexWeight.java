class Solution {
    int sum;
    int total;
    int index;
    int indexSum;
    int[] arr;
    public Solution(int[] w) {
        index=0;
        total=0;
        sum=0;
        indexSum=w[0];
        arr=new int[w.length];
        for(int i=0;i<w.length;i++){
            arr[i]=w[i];
            sum+=w[i];
        }
    }
    
    public int pickIndex() {
        total++;
        if(total>indexSum&&total<=sum){
            index++;
            indexSum+=arr[index];
        }
        if(total==sum){
            index=0;
            total=0;
            indexSum=arr[0];
        }
        return index;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
