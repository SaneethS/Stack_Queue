package com.stackqueue;

/**class has been created to implement all the functions of linked list
 * @author saneeths
 *
 */
public class LinkedList<T> {
	private Node<T> head;
	
	/**this method is created to add the values to the linked list
	 * @param data
	 */
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
	}
	
	/**this method appends the value to the linked list at the end
	 * @param data
	 * @return
	 */
	public boolean append(final T data) {
		boolean isAdded  = false;
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
			isAdded  =true;
		}else {
			Node<T> temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next  = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/**this method is created to insert the element at particular position
	 * @param pos
	 * @param data
	 */
	public void insertAtPos(int pos, T data) {
		Node<T> newNode = new Node<T>(data); 
		newNode.next = null;
		
		if(pos < 1) {
			System.out.println("Invalid position");
			return;
		}
		
		if(pos == 1) {
			push(data);
		}else {
			Node<T> temp;
		    temp = head;
		    for(int i = 1; i < pos-1; i++) {
		      if(temp != null) {
		        temp = temp.next;
		      }
		    }
		    if(temp != null) {
			      newNode.next = temp.next;
			      temp.next = newNode;  
			} else {
			   System.out.println("The previous node is null");
			}
		}
		
	}
	
	/**this method is created the values from the linked list
	 * @return
	 */
	public T pop() {
		if(head == null) {
			System.out.println("List is empty!!");
			return null;
		}
		Node<T> temp = head;
		head = temp.next;
		return temp.data;
	}
	
	/**this method is created to pop the last element from the list
	 * @return
	 */
	public T popLast() {
		if(head == null) {
			System.out.println("List is empty!!");
			return null;
		}
		if(head.next == null) {
			Node<T> temp = head;
			head = null;
			return temp.data;
		}
		
		Node<T> temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		T data = temp.next.data;
		temp.next = null;
		return data;
	}
	
	/**this method is created to check whether the particular value is present in the list
	 * return true if present otherwise false 
	 * @param element
	 * @return
	 */
	public boolean search(T element) {
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node<T> temp = head;
		boolean isFound = false;
		while(temp != null) {
			if(temp.data == element) {
				isFound =true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
	}
	
	
	/**this method is created to remove the element from certain position
	 * @param element
	 * @return
	 */
	public boolean remove(T element) {
		if(!search(element)) {
			System.out.println("Data not found!!");
			return false;
		}
		Node<T> temp = head;
		Node<T> prev = null;
		if(temp != null && temp.data == element) {
			head =temp.next;
			return true;
		}
	
			
		while(temp != null) {
			if(temp.data == element ) {
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return false;
	}
	
	
	/**
	 * this is the method used to display the linked list
	 */
	public void print() {
		Node<T> temp = head;
		
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}
