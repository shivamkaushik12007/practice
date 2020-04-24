class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=0;
        int p=stones.length;
        Arrays.sort(stones);
        while(n<stones.length-1){
            if(stones[p-1]==stones[p-2]){
                stones[p-1]=0;
                stones[p-2]=0;
                n+=2;
            }else{
                if(stones[p-1]>stones[p-2]){
                    stones[p-1]=stones[p-1]-stones[p-2];
                    stones[p-2]=0;
                }else{
                    stones[p-2]=stones[p-2]-stones[p-1];
                    stones[p-1]=0;
                }
                n++;
            }
            Arrays.sort(stones);
        }
        return stones[p-1];
    }
}
