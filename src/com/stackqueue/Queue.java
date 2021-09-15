package com.stackqueue;


/**this is the method ceated all the functionalities of the queue
 * @author saneeths
 *
 */
public class Queue<T> {
	private Node<T> head;
	
	LinkedList<T> linkedList = new LinkedList<>();
	
	/**this method is used to add elements to the queue hence is enqueue
	 * @param data
	 */
	public boolean enqueue(T data) {
		return linkedList.append(data);
	}
	
	/**this method is used to deque the queue
	 */
	public T dequeue() {
		return linkedList.pop();
	}
	
	/**
	 * this method is used to display the queue
	 */
	public void printQueue() {
		
		System.out.println("Queue : ");
		linkedList.print();
		
	}
	
}
