package com.test.java.collection;

public class Ex65_Anonymous {
	
	public static void main(String[] args) {
		
		BBB b1 = new BBB();
		
		b1.aaa();
		
		AAA b2 = new BBB();
		
		b2.aaa();
		
		AAA b3 = new AAA() {

			@Override
			public void aaa() {

				System.out.println("aaa");
				
			}
			
		};
		
		b3.aaa();

	}

}

interface AAA {
	
	void aaa();
	
}

class BBB implements AAA {

	@Override
	public void aaa() {
	
		System.out.println("aaa");
		
	}

}
