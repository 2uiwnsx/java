package com.test.java.obj;

public class Ex40_Class {
	
	public static void main(String[] args) {
		
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setGender("남자");
		
		Person father = new Person();
		
		father.setName("홍아빠");
		father.setAge(50);
		father.setGender("남자");
		
		Person mother = new Person();
		
		mother.setName("최엄마");
		mother.setAge(48);
		mother.setGender("여자");
		
		hong.setFather(father);
		hong.setMother(mother);
		
		System.out.println(hong.info());
		
	}

}
