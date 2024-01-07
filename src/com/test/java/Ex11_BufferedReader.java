/*
	▶ 에러(Error)
		
		▷ 컴파일 에러
		
			◆ 컴파일 작업 중에 발생하는 에러
			◆ 컴파일러(javac.exe)가 문법 오류를 발견하면, 컴파일 작업을 중단한다.
			
		▷ 런타임 에러
		
			◆ 프로그램 실행 중에 발생하는 에러
			
		▷ 논리 에러
		
			◆ 컴파일 작업과 프로그램 실행 중에는 에러가 발생하지 않았지만, 최종 결과가 이상한 에러
			
	----------------------------------------------------------------------------------------------
	
	▶ Wrapper 클래스 : 원시형 데이터를 객체로 다루기 위한 클래스
		
		▷ byte : Byte 클래스
		▷ short : Short 클래스
		▷ int : Integer 클래스
		▷ long : Long 클래스
		▷ float : Float 클래스
		▷ double : Double 클래스
		▷ boolean : Boolean 클래스
		▷ char : Character 클래스
*/

package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_BufferedReader {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자를 입력하세요: ");
		int code = reader.read();
		reader.readLine();
		
		System.out.printf("%c\n", code);
		
		System.out.println();
		
		System.out.print("문자열을 입력하세요: ");
		String line = reader.readLine();
		
		System.out.println(line);
		
		System.out.println();
		
		System.out.print("숫자를 입력하세요: ");
		String num1 = reader.readLine();
		
		int num2 = Integer.parseInt(num1);
		
		System.out.println(num2);
		
		System.out.println();
		
		// Q. 두 숫자의 합을 출력하시오. (예시: 10.0 + 20.0 = 30.0)
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		String input1 = reader.readLine();
		
		double number1 = Double.parseDouble(input1);
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		String input2 = reader.readLine();
		
		double number2 = Double.parseDouble(input2);
		
		System.out.printf("%.1f + %.1f = %.1f\n", number1, number2, (number1 + number2));
		
	}

}
