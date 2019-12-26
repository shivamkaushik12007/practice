public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if(A==0)
            return arr;
        ArrayList<Integer> temp1=new ArrayList<>();
        temp1.add(1);
        arr.add(temp1);
        for(int i=1;i<A;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    temp.add(1);
                }else{
                    temp.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
            arr.add(temp);
        }
        return arr;

    }
}
