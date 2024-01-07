/*
	▶ 재귀 메서드(Recursive Method)
		
		▷ 메서드 구현부에서 자기 자신을 호출하는 메서드
		▷ 디렉터리 구조에서 많이 사용된다.
*/

package com.test.java;

public class Ex25_Method {
	
	public static void main(String[] args) {
	
		int n = 4;
		int result = m1(n);
		
		System.out.println(result);
		
		System.out.println();
		
		// Q. 4!을 구하는 메서드를 구현하시오.
		
		n = 4;
		result = getFactorial(n);
		
		System.out.printf("%d! = %d\n", n, result);
		
	}
	
	public static int m1(int n) {
		
		System.out.println(n);
		
		int result = (n == 1) ? 1 : m1(n - 1);
		
		return result;
		
	}
	
	public static int getFactorial(int n) {
		
		return ((n == 1) ? 1 : n * getFactorial(n - 1));
		
	}

}
