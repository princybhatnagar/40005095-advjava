package com.assignments.day1.linkedlist.operations;

import com.assignments.day1.linkedlist.node.Node;

public class linkedList {
Node first;

public void addNode(int value) {
	Node newNode=new Node();
	newNode.value=value;
	newNode.next= null;
	
	if(first ==null) {
		first=newNode;
		newNode.previous=null;	
		return;
	}
	
	Node node=first;
	while(node.next!=null) {
		node=node.next;
		
	}
	}
	
public int getNode(int pos) {
	int count;
	Node newnode=first;
	while(newnode!=null) {
		if(count == pos) {
			return newnode.value;
			count++;
			newnode=newnode.next;
			
		}}
}
	
	public int size() {
		int count;
		Node node=first;
		while(node!=null)
		{
			count++;
			node=node.next;
		}
		
	}
	
}
}
	
	

	
	
	
	

	
	



