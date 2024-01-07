package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d > %d = %b\n", a, b, (a > b));
		System.out.printf("%d >= %d = %b\n", a, b, (a >= b));
		System.out.printf("%d < %d = %b\n", a, b, (a < b));
		System.out.printf("%d <= %d = %b\n", a, b, (a <= b));
		System.out.printf("%d == %d = %b\n", a, b, (a == b));
		System.out.printf("%d != %d = %b\n", a, b, (a != b));
		
		System.out.println();
		
		// Q. 사용자가 입력한 나이를 토대로, 통과 여부를 출력하시오. (조건: 나이가 18세 이상이면 통과)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();

		System.out.println(age >= 18);
		
		scan.close();
		
		System.out.println();
		
		System.out.println('A' == 'A');
		System.out.println('A' == 'a');

		String s1 = "홍길동";
		String s2 = "홍";
		s2 = s2 + "길동";
		
		System.out.println(s1.equals(s2));

	}

}
