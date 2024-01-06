/*
	▶ Exception 클래스 : 모든 예외 클래스의 최상위 부모 클래스
		
	-----------------------------------------------------------------------------
	
	▶ try 블록 : 예외가 발생할 수 있는 코드를 감싸는 블록
	▶ catch 블록 : try 블록에서 발생한 예외를 처리하는 블록
	▶ finally 블록 : try-catch 구문에서 항상 실행되어야 하는 코드를 포함하는 블록
	
	-----------------------------------------------------------------------------
	
	▶ throws
	
		▷ 메서드 실행 중 발생 가능한 예외를 선언하는 키워드
		▷ 예외 발생 시, 해당 메서드를 호출한 곳에서 예외를 처리해야 한다.
		
	▶ throw
	
		▷ 예외를 직접 발생시키는 키워드
*/

package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex58_Exception {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();

		try {

			// m4();

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		// m5();

	}
	
	private static void m5() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();

		try {
			
			if (num % 2 == 0) {
				
				throw new Exception("홀수를 입력하세요.");
				
			}
	
			System.out.println("종료합니다.");
			
		} catch (Exception e) {

			System.out.println("예외가 발생했습니다.");
			System.out.println(e.getMessage());
			
		}
		
		scan.close();
		
	}
	
	private static void m4() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("문자열을 입력하세요: ");
			String input = reader.readLine();
			
		} catch (Exception e) {

		}
		
	}

	private static void m3() {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("숫자를 입력하세요: ");
			int num = scan.nextInt();

			System.out.println(100 / num);
			
			int[] nums = new int[3];
			
			System.out.print("인덱스를 입력하세요: ");
			int index = scan.nextInt();
			
			nums[index] = 10;
			
			scan = null;
			
			scan.nextLine();
			
			scan.close();
			
		} catch (ArithmeticException e) {
			
			System.out.println("0을 제외한 다른 숫자를 입력하세요.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("존재하지 않는 인덱스입니다.");
			
		} catch (NullPointerException e) {
			
			System.out.println("참조하는 객체가 존재하지 않습니다.");
			
		} catch (Exception e) {
			
			System.out.println("예외가 발생했습니다.");
			
		}

	}

	private static void m2() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		try {
			
			System.out.println(100 / num);
			
		} catch (Exception e) {
			
			System.out.println("0을 제외한 다른 숫자를 입력하세요.");
			
		} finally {
			
			System.out.println("종료합니다.");
			
		}
		
		scan.close();
		
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		if (num != 0) {
			
			System.out.printf("100 / %d = %d\n", num, (100 / num));
			
		} else {

			System.out.println("0을 제외한 다른 숫자를 입력하세요.");
			
		}
		
		try {
			
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, (100 / num));
			System.out.println(2);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		
		System.out.println("종료합니다.");
		
		scan.close();

	}

}
