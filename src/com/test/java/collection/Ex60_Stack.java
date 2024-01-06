/*
	▶ Stack : 후입선출(LIFO, Last-In-First-Out)의 원칙을 따르는 자료 구조
	▶ Queue : 선입선출(FIFO, First-In-First-Out)의 원칙을 따르는 자료 구조
*/

package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex60_Stack {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		
	}

	private static void m2() {

		Queue<String> queue = new LinkedList<String>();
		
		queue.add("짜장면");
		queue.add("짬뽕");
		queue.add("탕수육");
		
		System.out.println(queue.size());
		
		System.out.println();

		// 큐에서 요소가 제거된다.
		System.out.println(queue.poll());
		
		System.out.println(queue.size());
		
		System.out.println();
		
		// 큐에서 요소가 제거되지 않는다.
		System.out.println(queue.peek());
		
		System.out.println(queue.size());
		
		System.out.println();
		
		if (queue.size() != 0) {
			
			System.out.println(queue.poll());
			
		}
		
		if (!queue.isEmpty()) {
			
			System.out.println(queue.poll());
			
		}

	}

	private static void m1() {

		Stack<String> stack = new Stack<String>();
		
		stack.push("짜장면");
		stack.push("짬뽕");
		stack.push("볶음밥");
		
		System.out.println(stack.size());
		
		System.out.println();
		
		// 스택에서 요소가 제거된다.
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		System.out.println();
		
		// 스택에서 요소가 제거되지 않는다.
		System.out.println(stack.peek());
		
		System.out.println(stack.size());
		
		System.out.println();
		
		if (stack.size() != 0) {
			
			System.out.println(stack.pop());
			
		}
		
		if (!stack.isEmpty()) {
			
			System.out.println(stack.pop());
			
		}
		
	}

}
