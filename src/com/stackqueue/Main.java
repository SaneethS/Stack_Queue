package com.stackqueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to stacks and queue using linked list");
		
		Stack stack = new Stack();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		stack.pop();
		stack.peek();
		
		
		stack.print();
		
		System.out.println("");
		
		Queue queue = new Queue();
		
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
		queue.dequeue();
		
		queue.print();
	}
	

}
