/*
	▶ 상수(Constant)
			
		▷ 값을 수정할 수 없는 변수
		▷ 선언 방법 : final 자료형 변수명 = 값;
				
	▶ 리터럴(Literal)

		▷ 순수한 데이터
		▷ 예시 : 10, 0xF3 등
		
	-----------------------------------------------------------------------------------
	
	▶ 정수 리터럴의 자료형 : int
	
		▷ 운영체제가 한 번에 처리할 수 있는 데이터의 양이 4byte이기 때문이다.
		▷ 현재 대부분 64bit 운영체제를 사용하지만, 정수 리터럴의 자료형은 여전히 int다.
	
	▶ 실수 리터럴의 자료형 : double
	
	-----------------------------------------------------------------------------------
	
	▶ 'byte b1 = 100;'인 코드를 실행하면, 먼저 메모리의 한 공간에 100이 저장된다. 
	  그 다음, 변수 b1의 공간이 메모리에 만들어지고, 그곳에 다시 100이 저장된다.
	  즉, 변수 b1의 공간에 100이 바로 저장되는 것이 아니다.
*/

package com.test.java;

public class Ex05_Variable {
	
	public static void main(String[] args) {
		
		// 정수형
		
		byte b1 = Byte.MAX_VALUE;
		
		System.out.println("byte의 최대값: " + b1);
		
		byte b2 = Byte.MIN_VALUE;
		
		System.out.println("byte의 최소값: " + b2);
		
		System.out.println();
		
		short s1 = Short.MAX_VALUE;
		
		System.out.println("short의 최대값: " + s1);
		
		short s2 = Short.MIN_VALUE;
		
		System.out.println("short의 최소값: " + s2);
		
		System.out.println();

		int n1 = Integer.MAX_VALUE;
		
		System.out.println("int의 최대값: " + n1);

		int n2 = Integer.MIN_VALUE;
		
		System.out.println("int의 최소값: " + n2);
		
		System.out.println();

		long l1 = Long.MAX_VALUE;
		
		System.out.println("long의 최대값: " + l1);

		long l2 = Long.MIN_VALUE;
		
		System.out.println("long의 최소값: " + l2);
		
		System.out.println();
		
		// 실수형
		
		float f1 = 3.14F;
		
		System.out.println(f1);
		
		float f2 = 123.123456789012345678901234567890F;
		
		System.out.println(f2);
		
		float f3 = 123456789012345678901234567890F;
		
		System.out.println(f3);
		
		System.out.println();
		
		double d1 = 3.14;
		
		System.out.println(d1);
		
		double d2 = 123.123456789012345678901234567890;
		
		System.out.println(d2);
		
		double d3 = 123456789012345678901234567890D;
		
		System.out.println(d3);
		
		System.out.println();
		
		// 문자형
		
		char c1 = 'A';
		
		System.out.println(c1);
		
		char c2 = '1';
		
		System.out.println(c2);
		
		System.out.println();
		
		// 논리형
		
		boolean flag1 = true;
		
		System.out.println(flag1);
		
		boolean flag2 = false;
		
		System.out.println(flag2);
		
		System.out.println();
		
		// 문자열
		
		String name = "홍길동";
		
		System.out.println(name);
		
		String nick = "";
		
		System.out.println(nick);
		
		System.out.println();
		
		// Q. 두 숫자의 합을 출력하시오. (예시: 10 + 20 = 30)
		
		int num1 = 10, num2 = 20;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
	}

}
