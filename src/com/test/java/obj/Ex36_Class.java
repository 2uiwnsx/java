/*
	▶ 클래스 : 객체를 생성하기 위한 템플릿으로, 속성과 메서드를 정의한 것
	▶ 객체 : 클래스에서 정의한 속성과 메서드를 가지고 있는 구체적인 실체
	▶ 인스턴스 : 클래스에서 생성된 실제 객체
	▶ 캡슐화 및 정보은닉 : 특정 메서드를 통해서만 내부 데이터에 접근 가능하도록 하는 것
	▶ 인터페이스 : 클래스가 제공하는 메서드들을 명시적으로 정의한 것
	▶ 프로퍼티 : 객체의 속성을 나타내는 변수
	▶ 행동 : 객체가 수행할 수 있는 동작이나 기능
	▶ 상속 : 기존 클래스의 속성과 메서드를 재사용하여 새로운 클래스를 만드는 것
		
	-----------------------------------------------------------------------------------
		
	▶ UML(Unified Modeling Language)
			
		▷ Class Diagram
		▷ Package Diagram
		▷ Object Diagram
		▷ Component Diagram
		▷ Sequence Diagram
		▷ UseCase Diagram
		▷ Activity Diagram
		▷ State Diagram
*/

package com.test.java.obj;

public class Ex36_Class {
	
	public static void main(String[] args) {
		
		// Q. 우리집과 마트의 좌표를 출력하시오.

		Point point1 = new Point();
		
		point1.x = 100;
		point1.y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", point1.x, point1.y);
		
		Point point2 = new Point();
		
		point2.x = 300;
		point2.y = 400;
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n", point2.x, point2.y);
		
		System.out.println();

		// Q. 물건의 이름, 너비, 높이를 출력하시오.
		
		Size size = new Size();
		
		size.name = "모니터";
		size.width = 100;
		size.height = 150;
		
		System.out.println(size.name);
		System.out.println(size.width);
		System.out.println(size.height);
		
		System.out.println();
		
		// Q. 학생의 이름, 국어 점수, 수학 점수, 영어 점수를 출력하시오.
		
		Score student = new Score();
		
		student.name = "홍길동";
		student.kor = 100;
		student.math = 90;
		student.eng = 80;

		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student.math);
		System.out.println(student.eng);
		
	}

}

class Point {

	public int x, y;
	
}

class Size {
	
	public String name;
	public int width, height;
	
}

class Score {
	
	public String name;
	public int kor, eng, math;
	
}
