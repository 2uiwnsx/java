package com.test.java.obj.inheritance;

public class Ex53_interface {
	
	public static void main(String[] args) {

		Dad hong = new Dad();
		
		hong.goToWork();
		hong.work();
		hong.leaveWork();
		hong.earnMoney();
		hong.takeCareOfChildren();
		hong.sleep();
		
	}

}

interface Employees {
	
	void goToWork();
	void work();
	void leaveWork();
	
}

interface Dads {
	
	void earnMoney();
	void takeCareOfChildren();
	void sleep();
	
}

// 여러 개의 인터페이스를 상속받을 수 있다.
class Dad implements Employees, Dads {

	@Override
	public void goToWork() {
		
	}

	@Override
	public void leaveWork() {

	}

	@Override
	public void work() {
		
	}

	@Override
	public void earnMoney() {
		
	}

	@Override
	public void takeCareOfChildren() {
		
	}
	
	@Override
	public void sleep() {
		
	}

}
