import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner=new Scanner(System.in);
        Creep cp=new Creep();
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            cp.insert(scanner.nextInt());
        }
        cp.check();
        
    }

}

class Creep{
    Tree root;
    Creep(){    
    }
    public void check(){
        Map<Integer,Integer> mp=new HashMap<>();
        Queue<Tree> q=new LinkedList<>();
        q.add(root);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Tree temp=q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            if(temp.k>max)max=temp.k;
            if(temp.k<min)min=temp.k;
            mp.put(temp.k,temp.val);
            q.remove();
        }
        for(int i=min;i<=max;i++){
            System.out.print(mp.get(i)+" ");
        }
    }
    public void insert(int val){
        root=insert(root,val,0);
    }

    private Tree insert(Tree root,int val,int k){
        if(root==null){
            return new Tree(val,k);
        }
        if(root.val>val){
            root.left=insert(root.left,val,k-1);
        }else if(root.val<val){
            root.right=insert(root.right,val,k+1);
        }
        return root;
    }

    private class Tree{
        int val;
        int k;
        Tree left;
        Tree right;
        Tree(int val,int k){
            this.val=val;
            this.k=k;
        }
    }
}

