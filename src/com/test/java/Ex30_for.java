package com.test.java;

public class Ex30_for {

	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();

	}

	// 예제5
	private static void m5() {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = i; j <= 5; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
	}

	// 예제4
	private static void m4() {
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				if (i == 5 || j == 5) {
					
					break;
					
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
				
			}
			
			System.out.println();
			
		}
		
	}

	// 예제3
	private static void m3() {
		
		// Q. 쌍용교육센터의 각 강의실에 있는 학생의 번호를 출력하시오.

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 30; j++) {
				
				System.out.printf("%d강의실 %d번\n", i, j);
				
			}
			
			System.out.println();
			
		}
		
	}

	// 예제2
	private static void m2() {
		
		// Q. 구구단을 출력하시오.
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println("===========");
			System.out.printf("    %d단\n", i);
			System.out.println("===========");
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.printf("%d * %2d = %2d\n", i, j, i * j);
				
			}
			
		}
		
	}

	// 예제1
	private static void m1() {
		
		// Q. 모든 시각을 출력하시오.
		
		for (int i = 0; i < 24; i++) {

			for (int j = 0; j < 60; j++) {
				
				for (int k = 0; k < 60; k++) {
					
					System.out.printf("시: %d, 분: %d, 초: %d\n", i, j, k);
					
				}

			}

		}

	}

}
