package com.stackqueue;

/**this is the method ceated all the functionalities of the stack
 * @author saneeths
 *
 */
public class Stack<T> {
	
	private Node<T> head;
	
	LinkedList<T> linkedList = new LinkedList<>();
	
	/**this method is created to push the values to the stack 
	 * @param data
	 */
	public void push(T data) {
		linkedList.push(data);
	}
	
	/**this method is used to pop the elements from the stack
	 */
	public T pop() {
		return linkedList.pop();
	}
	
	/**this method is used to peak the elements from the stack
	 * @return
	 */
	public T peek() {
		if(head == null) {
			System.out.println("Stack is empty!!");
			return null;
		}
		Node<T> temp = head;
		return temp.data;
	}
	
	/**
	 * this method is created to display the stack
	 */
	public void printStack() {
		
		System.out.println("Stack : ");
		linkedList.print();
		
		
	}
}
