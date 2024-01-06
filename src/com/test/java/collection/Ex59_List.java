/*
	▶ 컬렉션(Collection) : 배열에 비해 요소를 효율적으로 추가, 검색, 삭제할 수 있는 자료 구조
			
		▷ List
				
			◆ ArrayList
			◆ LinkedList
			◆ Vector
				
		▷ Set
				
			◆ HashSet
			◆ TreeSet
			
		▷ Queue
			
	▶  Map
			
		▷ HashMap
		▷ HashTable
		▷ TreeMap
		▷ Properties
*/

package com.test.java.collection;

import java.util.ArrayList;

public class Ex59_List {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		
	}

	private static void m6() {
		
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		
		for (int i = 0; i < 10; i++) {
			
			list.add(i);
			
		}
		
		System.out.println(list);
		
		list.add(10);
		
		list.trimToSize();
		
	}

	private static void m5() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
			
		list.add(10);
		list.add(20);
		
		System.out.println(list.size());

		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.size());
		
	}

	private static void m4() {

		// Q. 성적표를 출력하시오.
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for (int i = 0; i < 10; i++) {
			
			int kor = (int)(Math.random() * 41) + 60;
			int math = (int)(Math.random() * 41) + 60;
			int eng = (int)(Math.random() * 41) + 60;
			
			Student student = new Student(("학생" + i), kor, math, eng);
			
			list.add(student);
			
		}
		
		System.out.println("==============================================");
		System.out.println("                   성적표");
		System.out.println("==============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Student s: list) {
			
			int total = s.getKor() + s.getEng() + s.getMath();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n", s.getName(), s.getKor(), s.getEng(), s.getMath(), total, avg);
			
		}
		
	}

	private static void m3() {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<ArrayList<ArrayList<Integer>>> list3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
	}

	private static void m2() {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		System.out.println(list.size());
		
		System.out.println();
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		
		System.out.println();
		
		list.set(2, "포도");
		
		System.out.println(list.get(2));
		
		System.out.println();
		
		list.remove(3);
		list.remove("포도");
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.printf("list.get(%d) = %s\n", i, list.get(i));
			
		}
		
		System.out.println();
		
		list.add(2, "파인애플");
		
		System.out.println(list);
		
		System.out.println();

		System.out.println(list.indexOf("파인애플"));
		System.out.println(list.lastIndexOf("파인애플"));
		System.out.println(list.contains("키위"));
		
		System.out.println();

		list.clear();
		
		System.out.println(list.isEmpty());
		
	}

	private static void m1() {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println(num.get(0));
		System.out.println(num.get(1));
		System.out.println(num.get(2));
		System.out.println(num.get(3));
		System.out.println(num.get(4));
		
		System.out.println();
		
		System.out.println(num.size());
		
	}

}
