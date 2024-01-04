/*
	▶ 변수 명명법

		 ▷ 헝가리언 표기법 : 변수명 앞에 자료형을 표기하는 방법
		 
		 	◆ 예시 : byte_weight 등
		 	◆ 활용 : 인터페이스명
		
		 ▷ 파스칼 표기법 : 단어별 첫 문자는 대문자로, 나머지는 소문자로 표기하는 방법
		 
		 	◆ 예시 : EnglishScore
		 	◆ 활용 : 클래스명
		 
		 ▷ 캐멀 표기법 : 파스칼 표기법과 유사하지만, 그와 달리 맨 앞 문자를 소문자로 표기하는 방법
		 
		 	◆ 예시 : englishScore
		 	◆ 활용 : 변수명, 메서드명
		 
		 ▷ 스네이크 표기법 : 각 문자를 '_'로 연결하고, 모든 문자를 소문자로 표기하는 방법
		 
		 	◆ 예시 : english_score
		 	◆ 활용 : 변수명, 메서드명
		 
		 ▷ 케밥 표기법 : 스네이크 표기법과 유사하지만, 그와 달리 각 단어를 '-'로 연결하여 표기하는 방법
		 
		 	◆ 예시 : english-score
		 	◆ '-'를 산술 연산자로 인식하므로, 해당 표기법을 사용할 수 없다.
*/

package com.test.java;

public class Ex04_DataType {
	
	public static void main(String[] args) {
		
		byte korean = 100;
		
		System.out.println("국어 점수(변경 전): " + korean);
		
		korean = 50;
		
		System.out.println("국어 점수(변경 후): " + korean);
		
		System.out.println();
		
		byte english = 90, math = 80;
		
		System.out.println("영어 점수: " + english);
		System.out.println("수학 점수: " + math);
		
		byte social = 90,
			 science = 80;
		
		System.out.println("사회 점수: " + social);
		System.out.println("과학 점수: " + science);
	
	}

}
