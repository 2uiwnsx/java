/*
	▶ 업 캐스팅(Up Casting)

		▷ 암묵적 형변환으로, 부모 클래스의 참조 변수가 자식 클래스의 객체를 가리킬 수 있도록 하는 것
		
	▶ 다운 캐스팅(Down Casting)

		▷ 명시적 형변환으로, 업 캐스팅된 객체를 다시 원래의 자식 클래스 타입으로 변환하는 것
*/

package com.test.java.obj.cast;

public class Ex54_Casting {
	
	public static void main(String[] args) {

		Child c1 = new Child();
		
		Parent p1 = c1;
		
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		Child c2 = new Child();
		
		Parent p2 = (Parent)c2;
		
		System.out.println();
		
		Child c3 = new Child();
		
		Parent p3 = c3;
		
		Child c4 = (Child)p3;
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
	}

}

class Parent {
	
	public int a;
	public int b;
	
}

class Child extends Parent {
	
	public int c;
	public int d;
	
}
