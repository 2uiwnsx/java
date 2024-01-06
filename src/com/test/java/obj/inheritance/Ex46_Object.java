/*
	▶ Object 클래스
	
		▷ 모든 클래스의 최상위 부모 클래스
		▷ 모든 클래스는 암묵적으로 Object 클래스를 상속받는다.
*/

package com.test.java.obj.inheritance;

public class Ex46_Object {
	
	public static void main(String[] args) {

		TestChild child = new TestChild();
		
		child.a = 10;
		child.b = 20;
		child.c = 30;
		child.d = 40;
		
	}

}

class TestParent extends Object {
	
	public int a;
	public int b;
	
}

class TestChild extends TestParent {
	
	public int c;
	public int d;
	
}
