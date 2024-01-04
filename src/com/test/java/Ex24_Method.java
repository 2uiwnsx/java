package com.test.java;

public class Ex24_Method {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		swap(a, b);
		
		System.out.println();
		
		String s1 = "홍길동";
		String s2 = "아무개";
		
		swap(s1, s2);
		
	}
	
	public static void swap(int a, int b) {
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %d, b: %d\n", a, b);
		
	}
	
	public static void swap(String a, String b) {
		
		System.out.printf("a: %s, b: %s\n", a, b);
		
		String temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %s, b: %s\n", a, b);
		
	}

}
