/*
	▶ 메서드 오버로딩(Method Overloading)

		▷ 매개변수의 개수 또는 자료형을 다양하게 구성함으로써, 같은 이름의 메서드를 여러 개 만들 수 있는 기술
		▷ 메서드 호출을 통해, 구현 성공 여부를 검증할 수 있다.
		▷ 여러 개의 매서드명을 외우지 않아도 된다는 장점이 있다.
*/

package com.test.java;

public class Ex23_Method {
	
	public static void main(String[] args) {
		
		test();
		test(10);
		test("홍길동");
		test(10, 20);
		
		System.out.println(100);
		System.out.println("문자열");
		
	}
	
	public static void test() {
		
	}
	
	public static void test(int n) {
		
	}
	
	public static void test(String s) {
		
	}
	
	public static void test(int n, int m) {
		
	}

	public static void println(int num) {
		
	}
	
	public static void println(String txt) {
		
	}

}
