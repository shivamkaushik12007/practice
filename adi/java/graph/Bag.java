package com.graph;

import java.util.Iterator;

public class Bag implements Iterable<Integer>{
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

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            private Node temp=head;
            @Override
            public boolean hasNext(){
                return temp!=null;
            }

            public Integer next(){
                int t=temp.key;
                temp=temp.next;
                return t;
            }
        };
    }

    private class Node{
        private int key;
        private Node next;
        Node(int key){
            this.key=key;
        }
    }
}
