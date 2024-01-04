package com.test.java;

public class Ex07_Variable {
	
	public static void main(String[] args) {
		
		// 주민등록번호는 수치형 데이터가 아니므로, 정수형 대신 문자열로 값을 저장해야 한다.
		int residentRegistrationNumber1 = 990718;
		
		System.out.println("주민등록번호 앞자리: " + residentRegistrationNumber1);
		
		String residentRegistrationNumber2 = "000717";
		
		System.out.println("주민등록번호 앞자리: " + residentRegistrationNumber2);

		// 숫자는 항상 10진수로 표현된다.
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
	}

}
