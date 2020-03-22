import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            if(temp>max){
                max=temp;
            }
            if(sq(temp)&&!arr.contains(temp)){
                arr.add(temp);
            }else{
                sum+=temp;
            }
        }
        int k=(int)Math.sqrt(max);
        if(!sq(max)){
            k++;
        }
        if(n>k){
            k=n;
        }
        int sum1=0;
        for(int i=1;i<=k;i++){
            if(!arr.contains(i*i)){
                sum1+=i*i;
            }
        }
        System.out.println(sum1-sum);
        // for(int i=0;i<n;i++){
        //     arr.add(scanner.nextInt());
        // }
        // Collections.sort(arr);
        // int k=1;
        // int cnt=0;
        // while(!arr.isEmpty()){
        //     int l=k*k;
        //     int temp=arr.get(0);
        //     if(arr.contains(l)){
        //         arr.remove(new Integer(l));
        //     }else if(temp>l){
        //         cnt+=l;
        //     }else{
        //         arr.remove(0);
        //         cnt+=l-temp;
        //     }
        //     k++;
        // }
        // System.out.println(cnt);
    }
    public static boolean sq(int x){
        double sq = Math.sqrt(x); 
	    return ((sq - Math.floor(sq)) == 0); 
    }
}
