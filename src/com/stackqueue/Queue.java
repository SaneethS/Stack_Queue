package com.stackqueue;


/**this is the method ceated all the functionalities of the queue
 * @author saneeths
 *
 */
public class Queue {
private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/**this method is used to add elements to the queue hence is enqueue
	 * @param data
	 * @return
	 */
	public boolean enqueue(int data) {
		boolean isAdded  = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			isAdded  =true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next  = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/**this method is used to deque the queue
	 * @return
	 */
	public int dequeue() {
		if(head == null) {
			System.out.println("Queue is empty!!");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	
	/**
	 * this method is used to display the queue
	 */
	public void print() {
		Node temp = head;
		
		System.out.println("Queue : ");
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}
