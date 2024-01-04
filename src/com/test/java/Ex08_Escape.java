/*
	▶ 이스케이프 시퀀스(Escape Sequence)
	
		▷ \n : new line
		
		▷ \r : carriage return
		
			◆ Home 키와 동일하게, 커서의 위치를 현재 라인의 맨 앞으로 이동시킨다.
			◆ Eclipse에서는 작동되지 않는다.
	
		▷ \t : tab
		
			◆ 다음번 탭의 위치로 커서를 이동시킨다.
		
		▷ \b : backspace
		
			◆ Eclipse에서는 작동되지 않는다.
		
		▷ \', \", \\
		
	-----------------------------------------------------------------------------
		
	▶ 각 운영체제에서의 개행 문자
	
		▷ 윈도우 : \r\n
		▷ 맥os : \r
		▷ 리눅스 : \n
*/

package com.test.java;

public class Ex08_Escape {
	
	public static void main(String[] args) {
		
		// Q. '안녕하세요.'와 '홍길동입니다.'를 각각 다른 라인에 출력하시오.
		
		String msg = "안녕하세요.\n홍길동입니다.";
		
		System.out.println(msg);
		
		msg = "안녕하세요.\r\n홍길동입니다.";
		
		System.out.println(msg);
		
		System.out.println();
		
		// Q. '하나	둘	셋'을 출력하시오.

		msg = "하나\t둘\t셋";
		
		System.out.println(msg);
		
		msg = "하나	둘	셋";
		
		System.out.println(msg);
		
		System.out.println();

		// Q. '홍길동: "안녕하세요."'를 출력하시오.
		
		msg = "홍길동: \"안녕하세요.\"";
		
		System.out.println(msg);
		
		System.out.println();
		
		// Q. 수업 폴더의 경로를 출력하시오.
		
		System.out.println("C:\\class\\code\\java");
		
		System.out.println();
		
		// Q. '홍길동님요.'를 출력하시오.
		
		msg = "홍길동님,\r안녕하세요.";

		System.out.println(msg);
		
		System.out.println();

		// Q. '홍길입니다.'를 출력하시오.
		
		msg = "홍길동\b입니다.";

		System.out.println(msg);
		
	}

}
