package com.stackqueue;

/**this is the method ceated all the functionalities of the stack
 * @author saneeths
 *
 */
public class Stack {
	
	private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/**this method is created to push the values to the stack 
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * this method is created to display the stack
	 */
	public void print() {
		Node temp = head;
		
		System.out.println("Stack : ");
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
