/*
	▶ 메서드 오버라이딩(Method Overriding)

		▷ 하위 클래스가 상위 클래스의 메서드를, 동일한 시그너처(메서드명, 매개변수 유형, 반환값의 자료형)로 재정의하는 것
*/

package com.test.java.obj.inheritance;

public class Ex47_Overriding {
	
	public static void main(String[] args) {
				
		OverrideParent parent = new OverrideParent();
		
		parent.name = "홍길동";
		
		parent.hello();
		
		OverrideChild child = new OverrideChild();
		
		child.name = "홍철수";
		
		child.hello();
		
	}

}

class OverrideParent {
	
	public String name;
	
	public void hello() {
		
		System.out.printf("안녕하세요. 저는 %s입니다.\n", this.name);
		
	}
	
}

class OverrideChild extends OverrideParent {

	@Override
	public void hello() {
		
		System.out.printf("안녕, 난 %s야!\n", this.name);
		
	}
	
}
