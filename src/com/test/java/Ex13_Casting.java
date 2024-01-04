/*
	▶ 자료형 변환(Data Type Casting)
	
		▷ 하나의 자료형을 또 다른 자료형으로 변환하는 작업
		▷ 코드를 유연하게 작성하기 위해 사용한다.
		
	---------------------------------------------------------------------------------------------
		 
	▶ 암시적 형변환

		▷ 자동으로 명시적 형변환이 된 것이다.
		 
	▶ 명시적 형변환

		▷ 형변환 연산자인 '(자료형)'을 사용한다.
		▷ 경우에 따라 안전하지 않을 수 있다.
		 
			◆ 오버플로우(Overflow) : 자료형의 최대값을 초과하는 현상
			◆ 언더플로우(Underflow) : 자료형의 최소값을 초과하는 현상
*/

package com.test.java;

public class Ex13_Casting {
	
	public static void main(String[] args) {

		byte a = Byte.MAX_VALUE;
		short b = a;
		
		System.out.println(b);

		short c = 100;
		byte d = (byte)c;
		
		System.out.println(d);
		
		// Q. 잔고가 0원인 계좌에 30억원을 이체한 결과를 출력하시오.

		long e = 3000000000L;
		int f = (int)e;
		
		System.out.printf("이체 결과: %d원\n", f);
		
	}

}
