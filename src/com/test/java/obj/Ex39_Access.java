/*
	▶ 접근 제어자(Access Modifier) : 클래스, 변수, 메서드 등의 멤버에 대한 접근 권한을 지정하는 키워드
	
		▷ public : 모든 클래스에서 접근할 수 있다.
		▷ protected : 동일한 패키지 내의 클래스 또는 해당 클래스를 상속한 클래스에서만 접근할 수 있다.
		▷ default : 동일한 패키지 내의 클래스에서만 접근할 수 있다.
		▷ private : 해당 멤버에 대한 접근을 선언한 클래스에서만 접근할 수 있다.
*/

package com.test.java.obj;

public class Ex39_Access {
	
	public static void main(String[] args) {

		Book book = new Book();

		book.aaa("자바의 정석");
		book.bbb(30000);
		
		System.out.println("가격: " + book.ccc() + "원");
		
		book.setAuthor("홍길동");
		
		System.out.println(book.getAuthor());
		
		System.out.println();
		
		Mouse m = new Mouse();
		
		m.setModel("M910");
		
		System.out.println(m.getModel());
		System.out.println(m.getColor());
		
		m.setPrice(50000);
		m.setDate(2020, 7, 31);
		
		System.out.println(m.getDate());
		System.out.println(m.getState());
		System.out.println(m.info());
		
	}

}
