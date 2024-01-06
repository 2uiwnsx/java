package com.test.java.collection;

public class Student {
	
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	public Student(String name, int kor, int math, int eng) {

		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}
	
	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	@Override
	public String toString() {
		
		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		
	}

}
