package com.test.java.obj.inheritance;

public class Ex45_Inheritance {
	
	public static void main(String[] args) {

		Parent parent = new Parent();
		
		parent.a = 10;
		parent.b = 20;
		
		Child child = new Child();
		
		child.a = 10;
		child.b = 20;
		
		child.aaa();
		
		child.c = 30;
		child.d = 40;
		
		child.ccc();
		
	}

}

class Parent {
	
	public int a;
	public int b;
	
	public void aaa() {
		
		System.out.println("aaa");
		
	}
	
}

class Child extends Parent {
	
	public int c;
	public int d;
	
	public void ccc() {
		
		System.out.println("ccc");
		
	}
	
}

class Member {
	
	public String id;
	public String pw;
	public String name;
	
}

class User extends Member {
	
	public String email;
	
}

class Administrator extends Member {
	
	public String lv;
	
}

class AAA {
	
	public int a = 10;
	
}

class BBB extends AAA {
	
	public int b = 20;
	
}

class CCC extends BBB {
	
	public int c = 30;
	
}

class DDD extends CCC {
	
	public int d = 40;
	
}
