import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(scanner.nextInt());
            }
            int cnt=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr.get(i)!=arr.get(j)&&(arr.get(i)+arr.get(j))%2==0){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt/2);
            // ArrayList<Integer> even=new ArrayList<>();
            // ArrayList<Integer> odd=new ArrayList<>();
            // Map<Integer,Integer> mp=new HashMap<>();
            // for(int i=0;i<n;i++){
            //     int temp=scanner.nextInt();
            //     if(mp.get(temp)==null){
            //         mp.put(temp,1);
            //     }else{
            //         mp.put(temp,mp.get(temp)+1);
            //     }
            // }
            // int cnt1=0,cnt2=0;
            // for(Map.Entry<Integer,Integer> l:mp.entrySet()){
            //     int temp=l.getKey();
            //     int temp1=l.getValue();
            //     if(temp%2==0){
            //         if(temp1==1){
            //             even.add(temp);
            //         }else{
            //             cnt1+=temp1;
            //         }
            //     }else if(temp%2!=0){
            //         if(temp1==1){
            //             odd.add(temp);
            //         }else{
            //             cnt2+=temp1;
            //         }
                    
            //     }
            // }

            //     int n1=odd.size();
            //     int n2=even.size();
            //     n1=(n1*(n1-1))/2+cnt2*n1;
            //     n2=(n2*(n2-1))/2+cnt1*n2;
            //     System.out.println((n1+n2));
        }
    }
}
