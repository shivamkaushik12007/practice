package com.tree.rbt;

public class LLRBT {
    private Node root;
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
	
	}

    private Node leftRotate(Node root){
        Node t=root.right;
        root.right=t.left;
        t.left=root;
        return t;
    }

    private Node rightRotate(Node root){
        Node t=root.left;
        root.left=t.right;
        t.right=root;
        return t;
    }

    private class Node{
        private int key;
        private Node left;
        private Node right;
        private int height;
        private Node(int key){
            this.key=key;
            this.color=red;
        }
    }
}
