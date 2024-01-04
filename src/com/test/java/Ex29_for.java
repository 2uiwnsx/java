/*
	▶ 초기식
			
		▷ 카운터 변수를 선언하고 초기화한다.
					   
	▶ 조건식
			
		▷ 반복문이 실행되는 조건을 나타낸다.
					   
	▶ 증감식

		▷ 카운터 변수에 저장된 값을 증가시키거나 감소시킨다.
*/

package com.test.java;

import java.util.Scanner;

public class Ex29_for {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		
	}
	
	// 예제13
	private static void m13() {
		
		// Q. 다섯 개의 난수를 출력하시오. (조건: 난수는 1 ~ 10 사이의 정수)

		for (int i = 1; i <= 5; i++) {
	
			System.out.println((int)(Math.random() * 10) + 1);

		}
		
		/*
			▶ Math.random() : 0 이상 1 미만의 실수
			▶ (int)(Math.random() * 10) : 0 이상 10 미만의 정수
			▶ (int)(Math.random() * 4) + 4 : 4 이상 8 미만의 정수
		*/

	}
	
	// 예제12
	public static int m12() {

		int num = 10;

		if (num % 2 == 0) {
			
			return 10;
			
		} else {
			
			return 0;
			
		}
		
	}

	// 예제11
	private static void m11() {

		// Q. 사용자가 짝수를 입력하면 반복을 중단하는 for문을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		for (;;) {
		
			System.out.print("숫자를 입력하세요: ");
			int num = scan.nextInt();
			
			if (num % 2 == 0) {
				
				return;
				
			}
				
		}
		
	}

	// 예제10
	private static void m10() {

		// Q. 학생 30명의 번호 중, 앞번호 15개를 출력하시오.
		
		for (int i = 1; i <= 30; i++) {
			
			if (i == 16) {
				
				break;
				
			}
			
			System.out.printf("%d번\n", i);
			
		}
		
		System.out.println();
		
		// Q. 학생 30명의 번호를 출력하시오. (조건: 10번, 15번은 미출력)
		
		for (int i = 1; i < 31; i++) {
			
			if (i == 10 || i == 15) {
				
				continue;
				
			}
			
			System.out.printf("%d번\n", i);
			
		}
		
	}

	// 예제9
	private static void m9() {
		
		/*
			▶ break : 반복문의 실행을 중단하는 키워드
			▶ continue : 현재 이후의 코드를 건너뛰고 다음 반복을 시작하는 키워드
		*/
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				
				break;
				
			}
			
			System.out.println(i);
			
		}
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				
				continue;
				
			}
			
			System.out.println(i);
			
		}

	}

	// 예제8
	private static void m8() {

		// for문을 통해 무한 루프를 만들 수 있다.
		for (;;) {
			
			System.out.println("반복문");
			
		}
		
	}

	// 예제7
	private static void m7() {

		// Q. 사용자가 입력한 단을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단을 입력하세요: ");
		int dan = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
			
		}
		
		scan.close();
		
	}

	// 예제6
	private static void m6() {

		// Q. 사용자가 입력한 숫자들의 합을 출력하시오.
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("숫자를 입력하세요: ");
			sum += scan.nextInt();
			
		}
		
		System.out.println(sum);
		
		scan.close();
		
	}

	// 예제5
	private static void m5() {

		// Q. 숫자 1 ~ 사용자가 입력한 숫자의 합을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			
			sum += i;
			
		}
		
		System.out.printf("1부터 %d까지의 합: %d\n", num, sum);
		
		scan.close();
		
	}

	// 예제4
	private static void m4() {

		// Q. 숫자 1 ~ 10의 합을 출력하시오.
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
			
		}
		
		System.out.println(sum);
		
	}

	// 예제3
	private static void m3() {
		
		// Q. 숫자 1 ~ 10을 출력하시오.
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println();
		
		// Q. 숫자 1 ~ 10 중 홀수를 출력하시오.
		
		for (int i = 1; i <= 10; i += 2) {
			
			System.out.println(i);
			
		}
		
		System.out.println();
		
		// Q. 숫자 1 ~ 10 중 짝수를 출력하시오.
		
		for (int i = 2; i <= 10; i += 2) {
			
			System.out.println(i);
			
		}
		
	}

	// 예제2
	private static void m2() {
		
		for (int i = 6; i <= 10; i++) {
			
			System.out.println("반복문");
			
		}
		
		System.out.println();
		
		for (int i = 1; i < 10; i += 2) {
			
			System.out.println("반복문");
			
		}
		
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			
			System.out.println("반복문");
			
		}
		
	}

	// 예제1
	private static void m1() {

		// Q. '안녕하세요.'를 5회 출력하시오.
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("안녕하세요.");
			
		}
		
	}

}
