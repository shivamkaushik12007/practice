public class Solution {
    public static int cycle=0;
    public int solve(int A, int[] B, int[] C) {
        LinkedList<Integer>[] arr = new LinkedList[A];
        for(int i=0;i<A;i++){
            arr[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<B.length;i++){
            if(!arr[B[i]-1].contains(C[i]-1))
                arr[B[i]-1].add(C[i]-1);
        }
        LinkedList<Integer> visited=new LinkedList<>();
        for(int i=0;i<A;i++) visited.add(0);
        for(int i=0;i<A;i++){
            if(visited.get(i)==0){
                dfsCheck(i,visited,arr);
            }
        }
        if(cycle==1) return 0;
        
        return 1;
    }
    public void dfsCheck(int u,LinkedList<Integer> visited,LinkedList<Integer>[] arr){
        if(visited.get(u)==0)visited.set(u,1);
        
        for(int i:arr[u]){
            if(visited.get(i)==1){
                cycle=1;
                return;
            }else if(visited.get(i)==0){
                dfsCheck(i,visited,arr);
            }
        }
        visited.set(u,-1);
    }
}
