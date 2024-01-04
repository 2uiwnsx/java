/*
	▶ CLI(Command Line Interface) : 텍스트 기반의 입출력 환경
	▶ GUI(Graphic User Interface) : 화면 기반의 입출력 환경
	
	▶ 콘솔 입출력(Console I/O)
	
		▷ 기본 입력 장치 : 키보드
		▷ 기본 출력 장치 : 모니터
		
	----------------------------------------------------------------------------------------------------
		
	▶ 메시지 출력 방식
	
		▷ System.out.println("메시지") : 메시지를 출력하고, 개행 처리를 한다.
		▷ System.out.print("메시지") : 메시지를 출력하고, 개행 처리를 하지 않는다.
		▷ System.out.printf("메시지") : 형식 문자를 사용하여 메시지를 출력하고, 개행 처리를 하지 않는다.
		
	----------------------------------------------------------------------------------------------------
		
	▶ 형식 문자
		
		▷ %s : 문자열
		▷ %d : 정수
		▷ %f : 실수
		▷ %c : 문자
		▷ %b : 논리값
*/

package com.test.java;

public class Ex09_Output {
	
	public static void main(String[] args) {
		
		// Q. 성적표를 출력하시오.
		
		String name1= "홍길동";
		int korean1 = 100;
		int english1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int korean2 = 85;
		int english2 = 77;
		int math2 = 89;
		
		System.out.println("==============================");
		System.out.println("	    성적표");
		System.out.println("==============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		
		System.out.print(name1);
		System.out.print("\t" + korean1);
		System.out.print("\t" + english1);
		System.out.println("\t" + math1);
		
		System.out.println(name2 + "\t" + korean2 + "\t" + english2 + "\t" + math2);
		
		System.out.println();
		
		// Q. '홍길동님, 안녕하세요. 홍길동님, 안녕히 가세요.'를 출력하시오.
		
		String name = "홍길동";
		
		System.out.println(name + "님, 안녕하세요. " + name + "님, 안녕히 가세요.");
		System.out.printf("%s님, 안녕하세요. %s님, 안녕히 가세요.\n", name, name);
		
		System.out.println();
		
		// Q. 1234567.1234567을 출력하시오. (조건: 총 20자리, 소수점 이하 2자리까지 표시, 천 단위 구분 기호 사용, 우측 정렬)
		
		double num = 1234567.1234567;
		
		System.out.printf("%,20.2f\n", num);
		
		System.out.println();
		
		// Q. 메뉴판을 출력하시오.
		
		System.out.println("==============================");
		System.out.println("     음료 가격 (단위: 원)");
		System.out.println("==============================");
		System.out.printf("콜라:\t\t\t%,6d\n", 2500);
		System.out.printf("사이다:\t\t\t%,6d\n", 3500);
		System.out.printf("라테:\t\t\t%,6d\n", 500);
		System.out.printf("아메리카노:\t\t%,6d\n", 15000);

	}

}
