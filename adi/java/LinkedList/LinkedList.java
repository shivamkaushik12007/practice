package com.tree.rbt;

public class LinkedList {
    private Node root;

    public void insert(int key){
        root=insert(root,key);
    }

    private Node insert(Node root,int key){
        Node n=new Node(key);
        n.next=root;
        return n;
    }

    public void printList(){
        Node n=root;
        while(n!=null){
            System.out.println(n.key);
            n=n.next;
        }
    }

    private class Node{
        private int key;
        private Node next;

        private Node(int key){
            this.key=key;
        }
    }
}
