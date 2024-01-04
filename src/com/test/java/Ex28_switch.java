package com.test.java;

import java.util.Scanner;

public class Ex28_switch {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		
	}

	// 예제4
	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		scan.skip("\r\n");
		
		System.out.print("문자열을 입력하세요: ");
		String txt = scan.nextLine();
		
		scan.close();
		
	}

	// 예제3
	private static void m3() {
		
		// Q. 사용자가 입력한 월의 마지막 날짜를 출력하시오.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		int month = scan.nextInt();
		
		int lastDay = 0;
		
		switch (month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				
				lastDay = 31;
				
				break;
			
			case 4: case 6: case 9: case 11:
				
				lastDay = 30;
				
				break;
				
			case 2:
				
				lastDay = 28;
				
				break;
		
		}
		
		System.out.printf("%d월의 마지막 날짜는 %d일입니다.\n", month, lastDay);
		
		scan.close();
		
	}

	// 예제2
	private static void m2() {

		// Q. 사용자가 입력한 번호에 해당하는 음료의 가격을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("	자판기");
		System.out.println("=======================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("-----------------------");
		System.out.print("번호를 입력하세요: ");
		int input = scan.nextInt();
		
		switch (input) {
		
			case 1:
			case 2:
				
				System.out.println("700원입니다.");
				
				break;
				
			case 3:
				
				System.out.println("500원입니다.");
				
				break;
				
			default:
				
				System.out.println("올바른 번호를 입력하세요.");
		
		}
		
		scan.close();
		
	}

	// 예제1
	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		switch (num) {
		
			case 1:
				
				System.out.println("하나");
				
				break;
				
			case 2:
				
				System.out.println("둘");
				
				break;
				
			case 3:
				
				System.out.println("셋");
				
				break;
				
		}
		
		scan.close();
		
	}

}
