/*
	▶ JDK(JRE, JVM 포함) 설치
	
		▷ https://www.oracle.com/kr/java/technologies/javase/jdk11-archive-downloads.html
		▷ jdk-11.0.18_windows-x64_bin.exe 다운로드
		▷ 제어판 ➤ 시스템 및 보안 ➤ 시스템 ➤ 고급 시스템 설정 ➤ 환경 변수 ➤ 시스템 변수 ➤ 새로 만들기
		
	 		◆ 변수 이름 : JAVA_HOME
	 		◆ 변수 값 : C:\Program Files\Java\jdk-11
	 		
		▷ 제어판 ➤ 시스템 및 보안 ➤ 시스템 ➤ 고급 시스템 설정 ➤ 환경 변수 ➤ 시스템 변수 ➤ Path ➤ 새로 만들기
	
			◆ %JAVA_HOME%\bin
	
	▶ Eclipse 설치
	
		▷ https://www.eclipse.org/downloads/packages/release/2021-03/r
		▷ Eclipse IDE for Enterprise Java and Web Developers 다운로드 및 압축 해제
		▷ Eclipse가 사용할 JVM을 지정하기 위해, eclipse.ini에서 -vm 수정
		
			◆ C:\Program Files\Java\jdk-11\bin\javaw.exe
	
	--------------------------------------------------------------------------------------------------------
	
	▶ Win + R : 실행창
	▶ cmd : 명령 프롬프트
	▶ cd : 원하는 디렉터리로 이동
	
	--------------------------------------------------------------------------------------------------------
	
	▶ javac.exe 파일명.java : 자바 컴파일러
	
		▷ 소스 코드(.java)를 바이트 코드(.class)로 변환
		
	▶ java.exe 파일명 : 자바 인터프리터
	
		▷ 프로그램 실행
	
	--------------------------------------------------------------------------------------------------------
	
	▶ 프로그램 = 데이터 + 알고리즘
	
	--------------------------------------------------------------------------------------------------------
	
	▶ Ctrl + Space : 코드 자동 완성
	▶ Ctrl + Shift + O : 클래스 자동 import
	▶ Ctrl + 1 : 메서드 자동 생성, 여러 라인에 위치한 동일한 명칭 동시 변경
	▶ Ctrl + Alt + 방향키 : 커서가 위치한 행의 내용을, 위 또는 아래에 복사
	▶ Alt + 방향키 : 커서가 위치한 행의 내용을, 위 또는 아래로 이동
	▶ Shift + 방향키 : 커서가 위치한 곳부터, 위 또는 아래의 내용 선택
	▶ Ctrl + Shift + L : Quick Search
	
	--------------------------------------------------------------------------------------------------------
	
	▶ 단일 행 주석
	
		▷ Ctrl + / : 주석 생성
		▷ Ctrl + / : 주석 해제
		
	▶ 다중 행 주석
	
		▷ Ctrl + Shift + / : 주석 생성
		▷ Ctrl + Shift + \ : 주석 해제
		
	--------------------------------------------------------------------------------------------------------
		
	▶ ~ : tilde						▶ ` : grave						▶ ! : exclamation mark
	▶ @ : at						▶ # : hash						▶ $ : dollar
	▶ % : percentage				▶ ^ : caret						▶ & : ampersand
 	▶ * : asterisk					▶ - : hyphen					▶ _ : underscore
	▶ + : plus						▶ = : equal						▶ [] : bracket
	▶ {} : brace					▶ () : parenthese				▶ | : vertical line
	▶ \ : backslash					▶ : : colon						▶ ; : semicolon
	▶ "" : quotation				▶ '' : apostrophe				▶ , : comma
	▶ . : period					▶ ? : question mark				▶/ : slash
*/

// 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

// 클래스 선언부
public class Ex01 {

	// 클래스 구현부
	public static void main(String[] args) {
		
		/*
			▶ System : 클래스
			▶ . : 멤버 접근 연산자
			▶ out : 필드
			▶ println() : 메서드
		*/
		
		System.out.println("안녕하세요.");
		
	}

}
