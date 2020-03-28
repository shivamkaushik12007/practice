import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int k=scanner.nextInt();
            while(!st.isEmpty()&&st.peek()>=k){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print("-1 ");
            }else{
                System.out.print(st.peek()+" ");
            }
            st.push(k);
        }
    }
}
