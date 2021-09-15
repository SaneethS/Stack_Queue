package com.stackqueue;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to stacks and queue using linked list");
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		
		
		
		stack.printStack();
		
		System.out.println("");
		
		Queue<Integer> queue = new Queue<>();
		
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
		
		queue.printQueue();
	}
	

}
