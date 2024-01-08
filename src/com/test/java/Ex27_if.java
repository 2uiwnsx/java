/*
	▶ 제어문
		
		▷ 조건 제어문
			
			◆ if 문
			◆ 중첩된 if 문
			◆ if ~ else 문
			◆ if ~ else if 문
			◆ switch 문

		▷ 반복 제어문
		
			◆ for 문
			◆ 중첩된 for 문
			◆ while 문
			◆ do while 문
			◆ foreach 문
		
		▷ 이동 제어문
		
			◆ break 문
			◆ 이름이 있는 break 문
			◆ continue 문
			◆ return 문
*/

package com.test.java;

import java.util.Scanner;

public class Ex27_if {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		
	}

	// 예제6
	private static void m6() {
		
		/*
			▶ 0, 0.0, \0(null), "" : false
			▶ 그 외의 값 : true
		*/
		
	}

	// 예제5
	private static void m5() {
		
		// Q. 개발자 성향을 알아보는 설문지를 만들고, 총점별로 알맞은 문구를 출력하시오.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Q. 어떤 개발 툴을 선호합니까?\n");
		System.out.println("1. 메모장");
		System.out.println("2. Eclipse");
		System.out.println("3. IntelliJ\n");
		System.out.print("번호를 입력하세요: ");
		int input = scan.nextInt();
		
		int sum = 0;
		
		if (input == 1) {
			
			sum += 3;
			
		} else if (input == 2) {
			
			sum += 5;
			
		} else if (input == 3) {
			
			sum += 7;
					
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Q. 어떤 프로그래밍 언어를 선호합니까?\n");
		System.out.println("1. Java");
		System.out.println("2. C#");
		System.out.println("3. Python\n");
		System.out.print("번호를 입력하세요: ");
		input = scan.nextInt();
		
		if (input == 1) {
			
			sum += 3;
			
		} else if (input == 2) {
			
			sum += 5;
			
		} else if (input == 3) {
			
			sum += 7;
					
		}
		
		System.out.println("------------------------------------------------");
		
		System.out.println("테스트를 완료했습니다.");
		System.out.print("[결과]: ");
		
		if (sum > 11) {
			
			System.out.println("당신은 진취적인 개발자입니다.");
			
		} else if (sum > 8) {
			
			System.out.println("당신은 평범한 개발자입니다.");
			
		} else {
			
			System.out.println("당신은 개발 업무가 적성에 맞지 않습니다.");
					
		}
		
		scan.close();
		
	}

	// 예제4
	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("빨강, 파랑, 노랑 중 하나를 입력하세요: ");
		String color = scan.nextLine();

		if (color.equals("빨강") || color.equals("파랑") || color.equals("노랑")) {
		
			if (color.equals("빨강") || color.equals("파랑")) {
				
				System.out.println("15,000원입니다.");
	
			} else if (color.equals("노랑")) {
				
				System.out.println("20,000원입니다.");
				
			}
			
		} else {
			
			System.out.println("재고가 없습니다.");

		}
		
		scan.close();
		
	}

	// 예제3
	private static void m3() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("기상 시간(시)을 입력하세요: ");
		int hour = scan.nextInt();
		
		if (hour < 6) {
			
			System.out.println("지하철을 타고 출근합니다.");
			
		} else if (hour < 7) {
			
			System.out.println("버스를 타고 출근합니다.");
			
		} else if (hour < 8) {
			
			System.out.println("택시를 타고 출근합니다.");
			
		} else {
			
			System.out.println("병가를 제출합니다.");
			
		}
		
		scan.close();
		
	}

	// 예제2
	private static void m2() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		String result = (age >= 18) ? "성인입니다." : "미성년자입니다.";
		
		System.out.println(result);
		
		if (age >= 18) {
			
			result = "성인입니다.";
			
		} else {
			
			result = "미성년자입니다.";
		}
		
		System.out.println(result);
		
		scan.close();
		
	}

	// 예제1
	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		if (num > 0) {
				
			System.out.printf("%d은(는) 양수입니다.\n", num);
			
		} else if (num < 0){
			
			System.out.printf("%d은(는) 음수입니다.\n", num);
			
		} else {
			
			System.out.printf("0입니다.\n", num);
			
		}
		
		scan.close();
		
	}

}
