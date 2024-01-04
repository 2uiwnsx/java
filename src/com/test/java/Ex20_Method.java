package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
			
		// Q. 홍길동, 아무개, 하하하에게 인사하는 메서드를 구현하시오.
		
		hello1();
		hello2();
		hello3();
		
		System.out.println();
		
		helloEveryone("홍길동");
		helloEveryone("아무개");
		helloEveryone("하하하");
		
		System.out.println();
		
		checkAge(25);
		
		System.out.println();
		
		// Q. 합격 여부를 출력하는 메서드를 구현하시오. (조건: 총점이 250점 이상일 때 합격)
		
		checkScore("홍길동", 100, 90, 80);
		checkScore("아무개", 50, 60, 70);
		
	}
	
	public static void hello1() {
		
		System.out.println("홍길동님, 안녕하세요.");
		
	}
	
	public static void hello2() {
		
		System.out.println("아무개님, 안녕하세요.");
		
	}
	
	public static void hello3() {
		
		System.out.println("하하하님, 안녕하세요.");
		
	}
	
	public static void helloEveryone(String name) {

		System.out.println(name + "님, 안녕하세요.");
		
	}
	
	public static void checkAge(int age) {
		
		String result = (age >=19) ? "성인" : "미성년자";
		
		System.out.printf("%d살은 %s입니다.\n", age, result);
		
	}
	
	public static void checkScore(String name, int korean, int english, int math) {
		
		int totalScore = korean + english + math;
		String result = (totalScore >= 250) ? "합격" : "불합격";
		
		System.out.printf("총점: %d점\n%s님은 %s하셨습니다.\n", totalScore, name, result);
		
		System.out.println();
		
	}

}
