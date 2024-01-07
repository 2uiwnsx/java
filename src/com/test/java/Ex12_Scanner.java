package com.test.java;

import java.util.Scanner;

public class Ex12_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("문자열을 입력하세요: ");
		String line = scan.nextLine();
		
		System.out.println(line);
		
		System.out.println();
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		System.out.println(num);
		
		System.out.println();
		
		// Q. 두 숫자의 합을 출력하시오. (예시: 10.0 + 20.0 = 30.0)
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		double number1 = scan.nextDouble();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		double number2 = scan.nextDouble();

		System.out.printf("%.1f + %.1f = %.1f", number1, number2, (number1 + number2));
		
		scan.close();
		
	}

}
