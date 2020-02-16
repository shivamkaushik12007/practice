//increasing
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> inp=new Stack<>();
        Stack<Integer> res=new Stack<>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            inp.push(scanner.nextInt());
        }
        while(!inp.isEmpty()){
            if(res.isEmpty()||res.peek()>inp.peek()){
                res.push(inp.pop());
            }else{
                int k=inp.pop();
                while(!res.isEmpty()&&k>res.peek()){
                    inp.push(res.pop());
                }
                res.push(k);
            }
        }
        while(!res.isEmpty()){
            System.out.print(res.pop()+" ");
        }
    }

}
//decreasing

import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> inp=new Stack<>();
        Stack<Integer> res=new Stack<>();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            inp.push(scanner.nextInt());
        }
        while(!inp.isEmpty()){
            if(res.isEmpty()||res.peek()<inp.peek()){
                res.push(inp.pop());
            }else{
                int k=inp.pop();
                while(!res.isEmpty()&&k<res.peek()){
                    inp.push(res.pop());
                }
                res.push(k);
            }
        }
        while(!res.isEmpty()){
            System.out.print(res.pop()+" ");
        }
    }

}
