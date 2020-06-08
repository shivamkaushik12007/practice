class Solution {
    public int change(int amount, int[] coins) {
        if(amount==0)return 1;
        Arrays.sort(coins);
        int[] arr=new int[amount+1];
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                arr[coins[i]]+=1;
                for(int j=coins[i];j<=amount;j++){
                    if(arr[j-coins[i]]>0){
                        // System.out.println(Arrays.toString(arr));
                        arr[j]+=arr[j-coins[i]];
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }
}
