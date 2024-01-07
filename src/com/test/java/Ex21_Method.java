package com.test.java;

public class Ex21_Method {
	
	public static void main(String[] args) {

		System.out.println(getNum());
		
		String result = getName("홍길동");
		
		System.out.println(result);
		
	}
	
	public static int getNum() {
		
		/*
			▶ return : 메서드의 실행을 중단하고, 해당 메서드가 호출된 곳으로 값을 반환하는 키워드
			▶ 반환값(리턴값) : 메서드 호출자에게 전달되는 값
		*/
		
		return 100;
		
	}
	
	public static String getName(String name) {
		
		return ("고객명: " + name);
		
	}

}
