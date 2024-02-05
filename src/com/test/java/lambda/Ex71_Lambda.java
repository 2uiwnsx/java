package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex71_Lambda {
	
	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		
	}

	private static void m3() {
		
		try {
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file1\\score.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				Student s = new Student(temp[0],
										Integer.parseInt(temp[1]),
										Integer.parseInt(temp[2]),
										Integer.parseInt(temp[3]));
				
				list.add(s);
				
			}

			list.sort((o1, o2) -> (o2.getTotal() - o1.getTotal()));
			
			System.out.println(list);
			
			reader.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex71_Lambda.m3");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m2() {
				
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			nums.add(rnd.nextInt(10) + 1);
			
		}
		
		System.out.println(nums);
		
		nums.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (o1 - o2);
				
			}

		});
		
		System.out.println(nums);
		
		nums.sort((o1, o2) -> (o2 - o1));
		
		System.out.println(nums);
		
	}

	private static void m1() {
		
		MyInterface m1 = new MyClass();
		
		m1.test();
		
		MyInterface m2 = new MyInterface() {

			@Override
			public void test() {

				System.out.println("익명 클래스에서 구현한 메서드");
				
			}
			
		};
		
		m2.test();
		
		// 람다식을 사용하여, 함수형 인터페이스의 추상 메서드를 간결하게 구현할 수 있다.
		MyInterface m3 = () -> {
			
			System.out.println("람다식으로 구현한 메서드");
			
		};
		
		m3.test();
		
		System.out.println();
		
		NoParameterNoReturn pr1 = () -> System.out.println("pr1");
		
		pr1.call();
		
		ParameterNoReturn pr2 = num -> System.out.println(num);
		
		pr2.call(100);

		MultiParameterNoReturn pr3 = (name, age) -> System.out.println(name + ", " + age);
		
		pr3.call("홍길동", 20);
		
		NoParameterReturn pr4 = () -> {return 100;};
		
		System.out.println(pr4.call());
		
		ParameterReturn pr5 = name -> name.length();
		
		System.out.println(pr5.call("홍길동"));
		
	}

}

interface MyInterface {
	
	void test();
	
}

class MyClass implements MyInterface {

	@Override
	public void test() {

		System.out.println("실명 클래스에서 구현한 메서드");
		
	}

}

interface NoParameterNoReturn {
	
	void call();
	
}

interface ParameterNoReturn {
	
	void call(int num);
	
}

interface MultiParameterNoReturn {
	
	void call(String name, int age);
	
}

interface NoParameterReturn {
	
	int call();
	
}

interface ParameterReturn {
	
	int call(String name);
	
}

class Student {
	
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

	public int getTotal() {
		
		return (this.kor + this.eng + this.math);
		
	}

	@Override
	public String toString() {
		
		return "Student [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
		
	}

}
