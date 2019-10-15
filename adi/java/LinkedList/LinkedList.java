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

    public void delete(){
        root=delete(root);
    }

    private Node delete(Node root){
        return root.next;
    }

    public void printList(){
        Node n=root;
        if(n==null){
            System.out.println("Linked List is Empty");
            return;
        }
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
