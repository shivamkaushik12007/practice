package com.tree.rbt;

public class Main {
    public static void main(String[] args) {
        LLRBT lb=new LLRBT();
        BST b=new BST();

        for(int i=1000;i>0;i--){
            b.insert(i);
            lb.insert(i);
        }
        System.out.println(b.search(10000));
        System.out.println(lb.height());
        System.out.println(b.height());
    }
}
