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



/*    Node insert(Node node, int key) { 
  
        /* 1.  Perform the normal BST insertion */
        if (node == null) 
            return (new Node(key)); 
  
        if (key < node.key) 
            node.left = insert(node.left, key); 
        else if (key > node.key) 
            node.right = insert(node.right, key); 
        else // Duplicate keys not allowed 
            return node; 
  
        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left), 
                              height(node.right)); 
  
        /* 3. Get the balance factor of this ancestor 
              node to check whether this node became 
              unbalanced */
        int balance = getBalance(node); 
  
        // If this node becomes unbalanced, then there 
        // are 4 cases Left Left Case 
        if (balance > 1 && key < node.left.key) 
            return rightRotate(node); 
  
        // Right Right Case 
        if (balance < -1 && key > node.right.key) 
            return leftRotate(node); 
  
        // Left Right Case 
        if (balance > 1 && key > node.left.key) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 
  
        // Right Left Case 
        if (balance < -1 && key < node.right.key) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 
  
        /* return the (unchanged) node pointer */
        return node; 
    } 
  */
