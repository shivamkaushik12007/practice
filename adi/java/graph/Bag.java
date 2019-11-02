package com.graph;

public class Bag implements Iterrable<T>{
    private Node head;

    public static void main(){
        Bag b=new Bag();
    }

    public void insert(int key){
        head=insert(head,key);
    }

    private Node insert(Node head,int key){
        if(head==null) return new Node(key);
        head.next=insert(head.next,key);
        return head;
    }
    private class Node{
        private int key;
        private Node next;
        Node(int key){
            this.key=key;
        }
    }
}
