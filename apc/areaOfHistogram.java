import java.lang.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int k=0;k<n;k++){
            int p=scanner.nextInt();
            a.add(p);
        }
        Stack<Integer> st=new Stack<Integer>();
        int max=0;
        st.push(0);
        int i=0;
        for(i=0;i<n;i++){
            if(st.empty()||a.get(i)>=a.get(st.peek())){
                st.push(i);
            }else{
                while(!st.empty() && a.get(st.peek())>a.get(i)){
                    int x=a.get(st.peek());
                    st.pop();
                    int dis=st.empty()?i:i-st.peek()-1;
                    int area=x*dis;
                    if(area>max){
                        max=area;
                    }
                }
                st.push(i);
            }
        }
        while(!st.empty()){
            int x=a.get(st.peek());
            st.pop();
            int dis=st.empty()?i:i-st.peek()-1;
            int area=x*dis;
            if(area>max){
                max=area;
            }
        }
        System.out.println(max);

    }
}
