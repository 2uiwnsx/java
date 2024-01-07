package com.test.java;

import java.util.Scanner;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		
		// Q. 사용자가 입력한 문자가, 소문자인지 확인한 결과를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String input = scan.nextLine();
		
		/*
			▶ 문자 코드 값
				
				▷ A : 65				▷ Z : 90
				▷ a : 97				▷ z : 12
				▷ 0 : 48				▷ 9 : 57
				▷ 가 : 44032			▷ 힣 : 55203
		*/

		int code = (int)input.charAt(0);
		
		System.out.printf("'%c'는 소문자가 %s\n", code, ((code >= 97 && code <=122) ? "맞습니다." : "아닙니다."));
		
		scan.close();
		
		/*
			▶ 아래의 세 가지 표현은 모두 동일한 결과를 갖는다.
			
				▷ code >= 97 && code <=122
				▷ code >= (int)'a' && code <= (int)'z'
				▷ code >= 'a' && code <= 'z'
		*/
		
	}

}
