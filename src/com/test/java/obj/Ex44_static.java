/*
	▶ 클래스 로딩(Class Loading)
	
		▷ 프로그램이 실행될 때, 클래스 파일(.class)을 메모리로 로드하는 작업
		▷ 클래스 로딩이 발생할 때, 정적 변수와 정적 메서드도 초기화된다.
*/

package com.test.java.obj;

public class Ex44_static {
	
	public static void main(String[] args) {

		Student.setSchool("역삼중학교");
		
		Student s1 = new Student();
		
		s1.setName("홍길동");
		s1.setAge(15);
		
		Student s2 = new Student();
		
		s2.setName("아무개");
		s2.setAge(15);
		
		Student s3 = new Student();
		
		s3.setName("이순신");
		s3.setAge(16);
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		System.out.println();
		
		// 객체를 생성하지 않아도 클래스명을 통해 메서드를 호출할 수 있다.
		int result = Util.add(10, 20);
		
		System.out.println(result);
		
	}

}

class Student {

	// 정적 변수 또는 클래스 변수로, 모든 객체가 동일한 값을 공유한다.
	private static String school;

	// 객체 변수로, 각 객체는 독립적인 값을 가진다.
	private String name;
	private int age;
	
	public static String getSchool() {
		return school;
	}
	
	// 정적 메서드에서는 객체 변수와 객체 메서드에 접근할 수 없다.
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		
		return String.format("%s(%d): %s 학생", this.name, this.age, Student.school);
		
	}

}

class Util {

	public static int add(int a, int b) {
		
		return a + b;
		
	}
	
}

class Phone {
	
	public int size;
	private static int weight;
	public static int battery;
	private String color;
	private String number;

	public Phone() {

	}
	
	public Phone(String color, String number) {
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		Phone.weight = weight;
	}

	public static int getBattery() {
		return battery;
	}

	public static void setBattery(int battery) {
		Phone.battery = battery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
