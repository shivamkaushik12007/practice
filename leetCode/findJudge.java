class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==1)return 1;
        Map<Integer,ArrayList<Integer>> mp=new HashMap<>();
        int[] brr=new int[N+1];
        for(int i=0;i<trust.length;i++){
            if(mp.get(trust[i][1])==null){
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(trust[i][0]);
                mp.put(trust[i][1],arr);
            }else{
                mp.get(trust[i][1]).add(trust[i][0]);
            }
            brr[trust[i][0]]=1;
        }
        for(Map.Entry<Integer,ArrayList<Integer>> l:mp.entrySet()){
            if(l.getValue().size()==N-1&&brr[l.getKey()]==0) return l.getKey();
        }
        return -1;
    }
}
