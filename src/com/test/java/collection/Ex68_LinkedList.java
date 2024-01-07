/*
	▶ ArrayList
			
		▷ 요소 접근 속도가 빠르다.
		▷ 요소 삽입 및 삭제 속도가 상대적으로 느리다.
			
	▶ LinkedList
			
		▷ 요소 접근 속도가 상대적으로 느리다.
		▷ 요소 삽입 및 삭제 속도가 빠르다.
*/

package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex68_LinkedList {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		
	}

	private static void m2() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		long begin = 0;
		long end = 0;
		
		System.out.println("[순차적으로 데이터 추가]");
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			
			list1.add(i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList: %,dms\n", (end - begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			
			list2.add(i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList: %,dms\n", (end - begin));
		
		System.out.println();
		
		System.out.println("[데이터 삽입]");
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			list1.add(0, i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList: %,dms\n", (end - begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			list2.add(0, i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList: %,dms\n", (end - begin));
		
		System.out.println();
		
		System.out.println("[데이터 삭제]");
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			list1.remove(0);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList: %,dms\n", (end - begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			
			list2.remove(0);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList: %,dms\n", (end - begin));
		
		System.out.println();
		
		System.out.println("[순차적으로 데이터 삭제]");
		
		begin = System.currentTimeMillis();
		
		for (int i = list1.size() - 1; i >= 0; i--) {
			
			list1.remove(i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("ArrayList: %,dms\n", (end - begin));
		
		begin = System.currentTimeMillis();
		
		for (int i = list2.size() - 1; i >= 0; i--) {
			
			list2.remove(i);
			
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("LinkedList: %,dms\n", (end - begin));
		
	}

	private static void m1() {

		/*
			▶ LinkedList : 각 노드가 다음 노드를 가리키고 있다.
			▶ Double LinkedList : 각 노드가 이전 노드와 다음 노드를 가리키고 있다.
			▶ Double Circle LinkedList : Double LinkedList와는 달리, 첫 번째 노드와 마지막 노드가 서로 연결되어 있다.
		*/
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(10);
		list2.add(20);
		list2.add(30);

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
	}

}
