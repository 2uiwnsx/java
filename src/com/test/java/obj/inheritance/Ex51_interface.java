package com.test.java.obj.inheritance;

public class Ex51_interface {
	
	public static void main(String[] args) {
		
		M705 m1 = new M705();
		
		m1.click();
		
		G304 m2 = new G304();
		
		m2.click();
		
	}

}

interface Mouse {
	
	public void click();
	
}

// 인터페이스를 상속받는 클래스는, 해당 인터페이스에서 선언된 모든 추상 메서드를 구현해야 한다.
class M705 implements Mouse {

	@Override
	public void click() {
		
		System.out.println("클릭했습니다.");
		
	}
	
}

class G304 implements Mouse {

	@Override
	public void click() {

		System.out.println("클릭했습니다.");
		
	}
	
}
