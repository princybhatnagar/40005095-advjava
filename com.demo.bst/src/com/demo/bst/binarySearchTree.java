package com.demo.bst;

public class binarySearchTree {
	
	public Node createNewNode(int value) {
	    Node a = new Node();
	    a.data = value;
	    a.left = null;
	    a.right = null;
	    return a;
	  }
	
	
	
	
	public Node insert(Node node, int value) {
	    if(node == null) {
	      return createNewNode(value);
	    }
	    
	    if(value < node.data) {
	      node.left = insert(node.left, value);
	    } else if((value > node.data)) {
	      node.right = insert(node.right, value);
	    }
	    
	    return node;
	  }
	
	public void inOrder(Node node)
	{
		if (node == null) 
		return; 
	inOrder(node.left);
	System.out.printf("%d ", node.data);
	inOrder(node.right); 
	}
	
	public void preorder(Node node) {
		if(node ==  null) 
			return;
		
			System.out.printf("%d ",node.data);
			preorder(node.left);
			preorder(node.right);
		}
		
		public void postorder(Node node) {
			if(node ==  null)
			return;
			
				preorder(node.left);
				preorder(node.right);
				System.out.printf("%d ",node.data);
			}
		
		


}
