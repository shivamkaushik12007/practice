package com.tree.rbt;
import java.util.*;
import java.lang.*;

public class BSTGEN<K extends comparable<K>,V> {
    private Node root;

    public void insert(K key,V value){
        root=insert(root,key,value);
    }

    private Node insert(Node root,K key,V value){
        if(root==null)return new Node(key,value);

        if(root.key.compareTo(key)>0)
            root.left=insert(root.left,key,value);
        else if(root.key.compareTo(key)<0)
            root.right=insert(root.right,key,value);
		else if(root.key.compareTo(key)==0)
			root.value=value;
		
        return root;
    }

    private class Node{
        private K key;
		private V value;
        private Node left;
        private Node right;

        private Node(K key,V value){
            this.key=key;
			this.value=value;
        }
    }
}
