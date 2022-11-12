package com.dsa.q2.MNC;

class Node {
    int val;
    Node left,right;
    
    Node(int item) {
		val = item;
		left = right = null;
    }
}
	
 public class TransactionsMNC{
		
		    public static Node node;
		    static Node prevNode = null;
		    static Node newHead = null;
		    
			    static void processBST(Node root){
			        if(root == null) {
			        	return;
			        }	
			 
			        processBST(root.left);
			        Node rightNode = root.right;
			        
			        if(newHead == null)
			        {
			            newHead = root;
			            root.left = null;
			            prevNode = root;
			        }
			        else
			        {
			         	
			            prevNode.right = root;
			            root.left = null;
			            prevNode = root;
			        }
			        processBST(rightNode);
			    }  
			    static void traverse(Node root){
			        
			        if(root == null)
			        	return;
			        System.out.print(root.val + " ");
			        traverse(root.right);       
			    }
			    
	 public static void main(String[] args) {
		    				        
		        node = new Node(50);
		        node.left = new Node(30);
		        node.right = new Node(60);
		        node.left.left = new Node(10);
		        node.right.left= new Node(55);
		        
		        processBST(node);
		        traverse(newHead);
		    }
    }