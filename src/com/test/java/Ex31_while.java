package com.test.java;

import java.util.Scanner;

public class Ex31_while {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		
	}

	// 예제4
	private static void m4() {

		// Q. 자판기를 출력하시오.
		
		int choice = 0;
		boolean loop = true;
		
		Scanner scan = new Scanner(System.in);
		
		while (loop) {
			
            menu();
            
            choice = scan.nextInt();
            scan.skip("\r\n");
            
            if (choice == 1) {
            	
            	cola(scan);
            	
            } else if (choice == 2) {
            	
            	cider(scan);
            	
            } else if (choice == 3) {
            	
            	coffee(scan);
            	
            } else  {
            	
            	loop = false;
            	
            }
			
		}
		
		System.out.println("\n프로그램을 종료합니다.");
		
	}

	private static void menu() {
		
		System.out.println("====================");
		System.out.println("       자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("4. 종료");
		System.out.println("--------------------");
		System.out.print("번호를 입력하세요: ");
		
	}
	
	private static void cola(Scanner scan) {
		
		System.out.println("\n콜라를 선택했습니다.\n");
		
		pause(scan);
		
	}
	
	private static void cider(Scanner scan) {
		
		System.out.println("\n사이다를 선택했습니다.\n");
		
		pause(scan);
		
	}
	
	private static void coffee(Scanner scan) {
		
		System.out.println("\n커피를 선택했습니다.\n");
		
		pause(scan);
		
	}
	
	private static void pause(Scanner scan) {
		
		System.out.println("Enter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

	// 예제3
	private static void m3() {

		// Q. 숫자 1 ~ 10의 합을 출력하시오.
		
		int num = 1, sum = 0;
		
		while (num <= 10) {
			
			sum += num;
			num++;
			
		}
		
		System.out.println(sum);
		
	}

	// 예제2
	private static void m2() {
		
		// Q. 숫자 1 ~ 10을 출력하시오.

		int num = 1;

		do {
			
			System.out.println(num);
			
			num++;
			
		} while (num <= 10);
		
	}

	// 예제1
	private static void m1() {

		// Q. 숫자 1 ~ 10을 출력하시오.
		
		int num = 1;
		
		while (num <= 10) {
			
			System.out.println(num);
			
			num++;
			
		}
		
	}

}
