/*
	▶ 변수(Variable)
	
		▷ 멤버 변수
		
		▷ 지역 변수
		
			◆ 메서드 내에서 선언한 변수
			◆ 매개변수도 지역 변수다.
			
	-------------------------------------------------------------------
			
	▶ 지역 변수의 생명주기

		▷ 변수 선언문이 실행되면, 해당 변수에 메모리 공간이 할당된다.
		▷ 변수 선언문이 포함된 메서드의 실행이 종료되면, 해당 메모리 공간이 해제된다.
*/

package com.test.java;

public class Ex22_LocalVariable {
	
	int x;
	
	public static void main(String[] args) {
		
		String name = "홍길동";
		
		System.out.println(name);
		
		m1();
		
	}
	
	public static void m1() {
		
		String name = "아무개";
		
		System.out.println(name);
		
	}

}
