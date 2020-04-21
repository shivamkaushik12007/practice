import java.util.*;
import java.lang.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> order=new ArrayList<>();
        ArrayList<Integer> desired=new ArrayList<>();
        for(int i=0;i<n;i++){
            order.add(scanner.nextInt());
        }
        for(int i=0;i<n;i++){
            desired.add(scanner.nextInt());
        }
        int i=0;
        int cnt=0;
        while(order.size()!=0){
            cnt+=check(order,desired.get(i));
            i++;
        }
        System.out.println(cnt);
    }
    public static int check(ArrayList<Integer> arr,int k){
        int cnt=1;
        while(arr.get(0)!=k){
            arr.add(arr.get(0));
            arr.remove(0);
            cnt++;
        }
        arr.remove(0);
        return cnt;
    }
}
