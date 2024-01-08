package com.test.java.obj.inheritance;

public class Ex67 {
	
	public static void main(String[] args) {
		
		CupChild c = new CupChild();

		c.check();
		
	}

}

class CupParent {
	
	private int a = 10;
	public int b = 20;
	
	public void check() {
		
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
	
}

class CupChild extends CupParent {
	
	private int c = 30;
	public int d = 40;
	
	public void check() {
		
		System.out.println(this.c);
		System.out.println(this.d);
		
		// super 키워드를 사용하여, 부모 클래스의 멤버에 접근할 수 있다.
		super.check();
		
	}
	
}