package com.tree.rbt;

public class Main {
    public static void main(String[] args) {
//        LLRBT lb=new LLRBT();
//        BST b=new BST();
//

//        System.out.println(b.search(10000));

//        System.out.println(b.height());
//        LinkedList l=new LinkedList();
        BST1 l=new BST1();
        for(int i=5;i>0;i--){
            l.insert(Integer.toString(i));
        }
        System.out.println(l.height());
        //        System.out.println();
//        l.delete();
//        l.delete();
//        l.delete();
//        l.delete();
//        l.printList();
//        l.delete();
//        l.printList();
    }
}
