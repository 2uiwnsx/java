/*
	▶ 메서드(Method)
		
		▷ 함수(Function), 프로시저(Procedure), 서브 루틴(Sub Routine)과 같은 말이다.
		▷ 특정한 목적을 가진 코드의 집합이다.
		▷ 알고리즘, 코드 관리, 코드 재사용의 단위다.
		▷ 클래스 내부에서 선언하며, 메서드 간의 순서는 무관하다.
		▷ 메서드 호출 시, 메서드 선언 부분으로 이동한다.
		
	▶ main() 메서드
		
		▷ 특수 메서드로, 이름이 예약어다.
		▷ 프로그램이 실행될 때 자동으로 호출된다.
		▷ 프로그램의 시작점(Entry Point)이자 프로그램의 종착점(End Point)이다.
*/

package com.test.java;

public class Ex19_Method {
	
	public static void main(String[] args) {

		// Q. '안녕하세요.'를 5회 출력하시오.
		
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		
		System.out.println();

		hello();
		hello();
		hello();
		hello();
		hello();
		
		System.out.println();
		
		printNumber();
		
	}
	
	public static void hello() {
		
		/*
			▶ public : 접근 제한자
			▶ static : 키워드
			▶ void : 반환값의 자료형
			▶ hello() : 메서드
		*/

		System.out.println("안녕하세요.");
		
	}
	
	public static void printNumber() {
	
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
	}

}
