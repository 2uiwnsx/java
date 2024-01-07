package com.test.java.obj.inheritance;

public class Ex50_final {
	
	public static void main(String[] args) {

		Test test = new Test();
		
		test.a = 20;

		System.out.println("남자: " + Gender.MALE);
		System.out.println("여자: " + Gender.FEMALE);
		
	}

}

class Test {
	
	public int a = 10;
	
	// final 키워드가 사용된 변수는 상수로 취급된다.
	public final int b = 20;
	
}

class Gender {
	
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	
}

class FinalParent {

	// final 키워드가 사용된 메서드는 오버라이딩될 수 없다.
	final public void test() {
		
		System.out.println("부모 메서드");
		
	}
	
}

// final 키워드가 사용된 클래스는 상속될 수 없다.
final class FinalMember{

}
