package com.tree.rbt;
import java.util.*;
import java.lang.*;

public class BST {
    private Node root;

    public void insert(int key){
        root=insert(root,key);
    }

    private Node insert(Node root,int key){
        if(root==null)return new Node(key);

        if(root.key>key)
            root.left=insert(root.left,key);
        else if(root.key<key)
            root.right=insert(root.right,key);

        return root;
    }

    public int search(int key){
        return search(root,key);
    }

    private int search(Node root,int key){
        if(root==null)
            return -1;
        if(root.key>key)
            return search(root.left,key);
        else if(root.key<key)
            return search(root.right,key);
        else if(root.key==key)
            return key;
        return 0;
    }

//    public void delete(int key){
//        root=delete(root,key);
//    }
//
//    private Node delete(Node root,int key){
//        if(root==null){
//            System.out.println("node is not present");
//            return root;
//        }
//        if(root.key>key){
//            root.left=delete(root.left,key);
//        }else if(root.key<key){
//            root.right=delete(root.right,key);
//        }else if(root.key==key){
//            if(root.left!=null){
//                root.key=getMax(root.left);
//                delMax(root)
//            }else if(root.right!=null){
//                root=getMin(root);
//            }else{
//                return null;
//            }
//        }
//        return root;
//    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }


    private class Node{
        private int key;
        private Node left;
        private Node right;

        private Node(int key){
            this.key=key;
        }
    }
}
