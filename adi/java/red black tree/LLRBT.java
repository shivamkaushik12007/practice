package com.tree.rbt;

public class LLRBT {
    private Node root;
    private static final boolean red=true;
    private static final boolean BLACK=false;
    public void insert(int key){
        root=insert(root,key);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    private Node insert(Node root,int key){
        if(root==null)return new Node(key);

        if(root.key>key)
            root.left=insert(root.left,key);
        else if(root.key<key)
            root.right=insert(root.right,key);

        if(getColor(root.left)==!red && getColor(root.right)==red)
            root=leftRotate(root);
        if(getColor(root.left)==red && getColor(root.left.left)==red)
            root=rightRotate(root);
        if(getColor(root.left)==red && getColor(root.right)==red)
            root=flipColor(root);

        return root;
    }

    private boolean getColor(Node n) {
        return n == null ? BLACK : n.color;
    }

    private Node leftRotate(Node root){
        Node t=root.right;
        root.right=t.left;
        t.left=root;
        t.color=root.color;
        root.color=red;
        return t;
    }

    private Node rightRotate(Node root){
        Node t=root.left;
        root.left=t.right;
        t.right=root;
        t.color=root.color;
        root.color=red;
        return t;
    }

    private Node flipColor(Node root){
        root.left.color=!red;
        root.right.color=!red;
        root.color=red;
        return root;
    }

    private class Node{
        private int key;
        private Node left;
        private Node right;
        private boolean color;
        private Node(int key){
            this.key=key;
            this.color=red;
        }
    }
}
