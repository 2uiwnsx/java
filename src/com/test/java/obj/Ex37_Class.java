package com.test.java.obj;

public class Ex37_Class {
	
	public static void main(String[] args) {

		User u1 = new User();
		
		u1.name = "홍길동";
		u1.age = 20;
		
		u1.hello();
		
		User u2 = new User();
		
		u2.name = "아무개";
		u2.age = 22;
		
		u2.hello();
		
		System.out.println();

		MyMath m = new MyMath();
		
		m.add(10, 20);
		m.substract(100, 50);
		
	}

}

class User {

	public String name;
	public int age;
	
	public void hello() {
		
		System.out.printf("안녕하세요. 저는 %d살 %s입니다.\n", age, name);
		
	}
	
}

class MyMath {
	
	public void add(int a, int b) {
		
		System.out.println(a + b);
		
	}
	
	public void substract(int a, int b) {
		
		System.out.println(a - b);
		
	}
	
}
