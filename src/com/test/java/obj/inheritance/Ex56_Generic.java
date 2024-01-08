package com.test.java.obj.inheritance;

public class Ex56_Generic {
	
	public static void main(String[] args) {

		WrapperObject n1 = new WrapperObject(10);
		
		System.out.println(n1.toString());
		System.out.println(((Integer)n1.getData()) * 2);
		
		System.out.println();
		
		WrapperObject s1 = new WrapperObject("홍길동");
		
		System.out.println(s1.toString());
		System.out.println(((String)s1.getData()).length());
		
		System.out.println();
		
		WrapperObject b1 = new WrapperObject(true);
		
		System.out.println(b1.toString());
		System.out.println((Boolean)b1.getData() ? "참" : "거짓");
		
		System.out.println();
		
		Wrapper<Integer> n2 = new Wrapper<Integer>(10);
		
		System.out.println(n2.toString());
		System.out.println(n2.getData() * 2);
		
		System.out.println();
		
		Wrapper<String> s2 = new Wrapper<String>("홍길동");
		
		System.out.println(s2.toString());
		System.out.println(s2.getData().length());
		
		System.out.println();
		
		Wrapper<Boolean> b2 = new Wrapper<Boolean>(true);
		
		System.out.println(b2.toString());
		System.out.println(b2.getData() ? "참" : "거짓");
		
	}

}

class WrapperObject {
	
	private Object data;
	
	public WrapperObject(Object data) {
		
		this.setData(data);
		
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {

		return "[data = " + this.data + "]";
		
	}
	
}

/*
	▶ T : 멤버 변수에 저장할 데이터의 자료형을 전달받는 매개변수로, 참조형만을 전달받을 수 있다.
	▶ <> : 매개변수 리스트
*/

class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		
		this.setData(data);
		
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		
		return "Wrapper [data=" + data + "]";
		
	}

}
