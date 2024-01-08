package com.test.java.obj;

public class Ex42_Constructor {
	
	public static void main(String[] args) {
		
		/*
			▶ new : 객체를 생성하는 키워드
			▶ Cup() : 기본 생성자
		*/
		
		Cup c1 = new Cup();
		
		System.out.println(c1.info());
		
		Cup c2 = new Cup();
		
		c2.setColor("green");
		c2.setSize(500);
		
		System.out.println(c2.info());
		
		Cup c3 = new Cup("pink");
		
		System.out.println(c3.info());
		
		Cup c4 = new Cup(350);
		
		System.out.println(c4.info());
		
		Cup c5 = new Cup("orange", 600);
		
		System.out.println(c5.info());
		
	}

}
