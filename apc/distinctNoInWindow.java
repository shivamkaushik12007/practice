public class Solution {
    public int[] dNums(int[] A, int B) {
        int k=A.length-B+1;
        int[] arr=new int[k];
        int size=0;
        for(int i=B;i<=A.length;i++){
            try{
                check(arr,A,i,size);
                size++;
            }catch(Exception e){
                System.out.println(size);        
            }
        }
        
        return arr;
    }
    public void check(int[] arr,int[] a,int r,int size){
        // String s="";
        ArrayList<Integer> s=new ArrayList<>();
        int count=0;
        for(int i=size;i<r;i++){
            if(!s.contains(a[i])){
                s.add(a[i]);
            }
        }
        // System.out.println(s);
        arr[size]=s.size();
    }
}
