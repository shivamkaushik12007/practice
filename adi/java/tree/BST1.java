package com.tree.rbt;
import java.lang.String;
public class BST1 {
    private Node root;

    public void insert(String key){
        root=insert(root,key);
    }

    private Node insert(Node root,String key){
        if(root==null)return new Node(key);

        if(root.key.compareTo(key)>0)
            root.left=insert(root.left,key);
        else if(root.key.compareTo(key)<0)
            root.right=insert(root.right,key);
        return root;
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }


    private class Node{
        private  String key;
        private Node left;
        private Node right;

        private Node(String key){
            this.key=key;
        }
    }
}
