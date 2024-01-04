package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {
	
	public static void main(String[] args) {
		
		/*
			▶ 배타적 논리합
			
				▷ T ^ T = F
				▷ T ^ F = T
				▷ F ^ T = T
				▷ F ^ F = F	
		*/
		
		int a = 10, b, c;
		c = b = a;
		
		System.out.printf("a: %d, b: %d, c: %d\n", a, b, c);
		
		System.out.println();
		
		/*
			▶ 복합 대입 연산자
			
				▷ +=
				▷ -=
				▷ *=
				▷ /=
				▷ %=
		*/
		
		int n = 50;
		n += 10;
		
		System.out.println(n);
		
		n -= 5;
		
		System.out.println(n);
		
		n *= 2;
		
		System.out.println(n);
		
		n /= 2;
		
		System.out.println(n);

		n %= 7;
		
		System.out.println(n);
		
		System.out.println();

		/*
			▶ ++변수명 : 전위 배치(전치)로, 소괄호를 제외한 연산자 중 우선순위가 가장 높다.
			▶ 변수명++ : 후위 배치(전치)로, 연산자 중 우선순위가 가장 낮다.
		*/

		int num = 10;
		int result1 = 10 + ++num;
		
		System.out.println(result1);
		
		num = 10;
		result1 = 10 + num++;
		
		System.out.println(result1);
		
		System.out.println();
		
		// Q. 사용자가 입력한 나이를 토대로, 통과 여부를 출력하시오. (조건: 나이가 18세 이상이고 60세 미만일 때 통과)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();

		String result2 = (age >= 18 && age < 60) ? "통과" : "불통과";
		
		System.out.printf("%d세는 %s입니다.\n", age, result2);
		
		scan.close();
		
		System.out.println();
		
		/*
			▶ & : 대응되는 비트 값이 모두 1일 때, 1을 반환한다.
			▶ | : 대응되는 비트 값이 모두 0이 아닐 때, 1을 반환한다.
			▶ ^ : 대응되는 비트 값이 서로 다를 때, 1을 반환한다.
		*/
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
	}
	
}
