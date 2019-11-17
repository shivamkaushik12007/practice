
public class Solution {
   
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
         @SuppressWarnings("unchecked")
        LinkedList<Integer>[] arr = new LinkedList[A];
        for(int i=0;i<A;i++){
            arr[i]=new LinkedList<Integer>();
        }
        for(int i=0;i<B.size();i++){
            if(!arr[B.get(i)-1].contains(C.get(i)-1))
                arr[B.get(i)-1].add(C.get(i)-1);
        }
        LinkedList<Integer> visited=new LinkedList<>();
        for(int i=0;i<A;i++) visited.add(0);
        for(int i=0;i<A;i++){
            if(visited.get(i)==0){
               if( dfsCheck(i,visited,arr)==0)
                    return 0;
            }
        }
       
       
        return 1;
    }
    public int dfsCheck(int u,LinkedList<Integer> visited,LinkedList<Integer>[] arr){
        visited.set(u,1);
         
        for(int i:arr[u]){
            if(visited.get(i)==1){
                return 0;
            }else if(visited.get(i)==0){
                if(dfsCheck(i,visited,arr) ==0)
  return 0;
            }
        }
        visited.set(u,-1);
       
       return 1;
    }
   
   
}
