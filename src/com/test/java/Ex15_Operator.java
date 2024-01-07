/*
	▶ 문장(Statement)
		
		▷ 프로그램에서 실행 가능한 최소 단위
		▷ 예시 : int sum = 10 + 20; 등
		 
	▶ 표현식(Expression)
	
		▷ 문장을 구성하는 최소 단위
		▷ 예시 : int sum, 10 + 20, sum = 30 등
		
	--------------------------------------------------------------------------------------
		 
	▶ 연산자(Operator)
	
		▷ 산술 연산자
		
			◆ 2항 연산자
			◆ 피연산자는 숫자형 리터럴이다.
			◆ 연산 결과의 자료형은, 크기가 큰 피연산자의 자료형이다.
		 	
		▷ 비교 연산자
		
			◆ 2항 연산자
			◆ 피연산자는 숫자형 리터럴이다.
			◆ 연산 결과의 자료형은 항상 논리형이다.
		
		▷ 논리 연산자
		 	
		 	◆ 1항 연산자 또는 2항 연산자
			◆ 피연산자의 자료형은 boolean이다.
			◆ 연산 결과의 자료형은 항상 논리형이다.
			
		▷ 대입 연산자
		
		▷ 증감 연산자
		
			◆ 1항 연산자
			◆ 피연산자는 숫자형 리터럴이 저장된 변수다.
		
		▷ 조건 연산자
		
			◆ 3항 연산자
			◆ 'A ? B : C;'에서 A는 논리값을 갖는 표현식, B와 C는 변수 또는 상수다.
	
		▷ 비트 연산자
		
	--------------------------------------------------------------------------------------
		 
	▶ 연산자의 우선순위
	
		▷ 어떤 연산자가 먼저 실행되는지에 대한 규칙
		▷ 순서 : 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		 
	▶ 연산자의 연산 방향
	
		▷ 우선순위가 동일한 연산자들 중, 어떤 연산자가 먼저 실행되는지에 대한 규칙
		▷ 대입 연산자와 증감 연산자를 제외한 모든 연산자는, 왼쪽에 위치한 것부터 실행된다.
*/

package com.test.java;

public class Ex15_Operator {
	
	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
		System.out.printf("%d / %d = %d\n", a, b, (a / b));
		System.out.printf("%d %% %d = %d\n", a, b, (a % b));
		
		System.out.println();
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%f / %f = %f\n", c, d, (c / d));
		
		System.out.println();

		System.out.println(100 / 0.0);
		
		System.out.println();
		
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println(e + f);
		System.out.println((long)e + f);
		
		System.out.println();

		// 자료형이 byte인 값들을 합산하거나 자료형이 short인 값들을 합산할 때는, 반드시 명시적 형변환을 해야 한다.
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(b3);
		
	}

}
