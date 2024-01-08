package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex62_HashSet {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		
	}

	private static void m3() {
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("홍길동");
		set1.add("홍길동");
		
		System.out.println(set1);
		
		System.out.println();

		HashSet<Person> set2 = new HashSet<Person>();
		
		set2.add(new Person("홍길동", 20));
		set2.add(new Person("아무개", 25));
		set2.add(new Person("이순신", 23));
		set2.add(new Person("홍길동", 20));
		
		System.out.println(set2);
		
	}

	private static void m2() {

		ArrayList<Integer> lotto1 = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			
			int n = (int)(Math.random() * 45) + 1;
			boolean flag = false;
			
			for (int j = 0; j < i; j++) {
				
				if (lotto1.get(j) == n) {
					
					flag = true;
					
					break;
					
				}
				
			}
			
			if (!flag) {
				
				lotto1.add(n);
				
			} else {
				
				i--;
				
			}

		}
		
		System.out.println(lotto1);
		
		System.out.println();
		
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			
			int n = (int)(Math.random() * 45) + 1;
			
			lotto2.add(n);
			
		}
		
		System.out.println(lotto2);
		
		System.out.println();
		
		for (int num : lotto2) {
			
			System.out.println(num);
			
		}
		
		System.out.println();
		
		/*
			▶ Iterator 인터페이스 : 컬렉션 객체를 순회하면서 각 요소에 접근하기 위한 인터페이스
			▶ hasNext() 메서드 : 순회할 다음 요소가 있는지 확인한다.
			▶ next() 메서드 : 다음 요소를 반환하고, 커서를 다음 위치로 이동시킨다.
		*/
		
		Iterator<Integer> iter = lotto2.iterator();
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}

	}

	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");

		HashSet<String> set = new HashSet<String>();
		
		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		System.out.println();
		
		System.out.println(list);
		System.out.println(set);
		
		System.out.println();
		
		list.add("고양이");
		
		System.out.println(list);
		
		set.add("고양이");
		
		System.out.println(set);
		
		System.out.println();
		
		list.remove(1);
		list.remove("거북이");
		
		System.out.println(list);

		set.remove("거북이");
		
		System.out.println(set);
		
	}

}

class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.setName(name);
		this.setAge(age);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		
		return "Person [name=" + name + ", age=" + age + "]";
		
	}
	
	@Override
	public int hashCode() {
	
		return (this.name + this.age).hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {

		return (this.hashCode() == obj.hashCode());
		
	}

}
