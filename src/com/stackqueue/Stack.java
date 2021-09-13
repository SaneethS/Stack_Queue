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
	
	/**this method is used to pop the elements from the stack
	 * @return
	 */
	public int pop() {
		if(head == null) {
			System.out.println("Stack is empty!!");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	
	/**this method is used to peak the elements from the stack
	 * @return
	 */
	public int peek() {
		if(head == null) {
			System.out.println("Stack is empty!!");
			return 0;
		}
		Node temp = head;
		return temp.data;
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
