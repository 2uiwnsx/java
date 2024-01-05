/*
	▶ 문자열은 불변한 특성을 가지고 있다.
	▶ StringBuilder 클래스를 사용하면, 내부 버퍼를 통해 문자열을 가변하게 다룰 수 있다.
	
	-----------------------------------------------------------------------------------
	
	▶ 동일한 내용의 문자열은 String Pool 영역에 위치한 메모리 공간을 공유한다.
*/

package com.test.java;

public class Ex35_String {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		
	}

	// 예제3
	private static void m3() {
		
		String s1 = "홍길동";
		String s2 = new String("홍길동");
		StringBuilder s3 = new StringBuilder("홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		System.out.println();
		
		long begin1 = System.nanoTime();
		
		String txt1 = "홍길동";
		
		for (int i = 0; i < 100000; i++) {
			
			txt1 += ".";
			
		}
		
		long end1 = System.nanoTime();

		System.out.println((end1 - begin1) + "ns");
		
		System.out.println();
		
		long begin2 = System.nanoTime();
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i = 0; i < 100000; i++) {
			
			txt2.append(".");
			
		}
		
		long end2 = System.nanoTime();

		System.out.println((end2 - begin2) + "ns");
		
	}

	// 예제2
	private static void m2() {

		String txt = "홍길동";
		
		for (int i = 0; i < 100; i++) {
			
			txt += "님";
			
		}
		
		System.out.println(txt);
		
	}

	// 예제1
	private static void m1() {

		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 += "길동";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 += "님";
		System.out.println(s1.equals(s3));
		
	}

}
