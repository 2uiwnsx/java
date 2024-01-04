/*
	▶ 메시지 입력 방식

		※ 사용자가 입력한 값은 항상 '값\r\n' 형태로 입력 버퍼에 저장된다. (\r : 13, \n : 10)
	
		▷ read() 메서드

			◆ Enter 키가 눌리면, 입력 버퍼에서 한 개의 문자만 읽고 출력한다. 이때, 읽은 문자는 삭제된다.
			
		▷ BufferedReader 클래스

			◆ 입력받은 값은 항상 문자 또는 문자열로 저장된다.
			◆ 입력 버퍼에서 \r\n 전까지의 모든 문자를 읽고 출력한다. 이때, 읽은 문자는 삭제된다.
			◆ readLine() 메서드가 호출되면, 읽은 문자와 함께 \r\n도 삭제된다.
		
		▷ Scanner 클래스
		
			◆ 입력받은 값은 각각의 자료형으로 저장된다.
			◆ 입력 버퍼에서 \r\n 전까지의 모든 문자를 읽고 출력한다. 이때, 읽은 문자는 삭제된다.
			◆ nextLine() 메서드가 호출되면, 읽은 문자와 함께 \r\n도 삭제된다.
*/

package com.test.java;

public class Ex10_Input {

	public static void main(String[] args) throws Exception {
		
		System.out.print("문자를 입력하세요: ");
		int code = System.in.read();
		
		System.out.printf("문자: %c\n", code);
		System.out.println("문자 코드 값: " + code);

	}

}
