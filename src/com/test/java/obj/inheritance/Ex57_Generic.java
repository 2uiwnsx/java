package com.test.java.obj.inheritance;

public class Ex57_Generic {
	
	public static void main(String[] args) {
		
		Desk<Boolean> desk = new Desk<Boolean>();

		desk.a = true;
		
		System.out.println(desk.get());
		
		System.out.println();

		Note<String, Integer> note = new Note<String, Integer>("홍길동", 20);
		
		System.out.println(note.getA());
		System.out.println(note.getB());
		
	}

}

class Desk<T> {
	
	public T a;
	
	public T get() {
		return this.a;
	}
	
	public void set(T a) {
		this.a = a;
	}
	
}

class Note<T, U> {
	
	public T a;
	public U b;
	
	public Note(T a, U b) {
		
		this.a = a;
		this.b = b;
		
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
	
}
