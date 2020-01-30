public class Solution {
    public int colorful(int A) {
        String s=Integer.toString(A);
        String k="";
        ArrayList<Integer> arr=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                String temp=s.substring(i,j);
                int l=Integer.parseInt(temp);
                // if(l!=A){
                    int m=check(l);
                    // System.out.println(m+" "+l+"i:"+i+"j:"+j);
                    if(arr.contains(m)){
                        return 0;
                    }else{
                        arr.add(m);
                    }
                // }
            }
        }
        return 1;
    }
    public int check(int k){
        int p=1;
        while(k>0){
            p*=(k%10);
            k=k/10;
        }
        return p;
    }
}
