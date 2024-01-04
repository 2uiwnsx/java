/*
	▶ 자료형의 크기 순서 : byte < short < int < long <<< float < double
	
	-------------------------------------------------------------------
	
	▶ 논리값은 형변환이 불가하다.
	▶ 물리적 구조로 인해, 값형과 참조형끼리는 형변환이 불가하다.
*/

package com.test.java;

public class Ex14_Casting {
	
	public static void main(String[] args) {
		
		// 정수 리터럴의 자료형은, int에서 byte, short, long으로 자동 변환된다.
		byte b1 = 10;
		short s1= 10;
		int n1 = 10;
		long l1 = 10L;
		
		// 실수 리터럴의 자료형은, double에서 float로 자동 변환된다.
		float f2 = 3.14F;
		double f3 = 3.14;
		
		// Overflow와 Underflow가 한 번에 발생할 수 있다.
		char a = '가';
		short b = (short)a;
		
		System.out.println(b);

		// 형변환처럼 보이지만, 사실상 형변환이 아니다.
		String c = "100";
		int d = Integer.parseInt(c);

		int e = 100;
		String f = String.valueOf(e);
		
	}

}
