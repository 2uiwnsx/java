package com.test.java.obj.inheritance;

public class Ex52_interface {
	
	public static void main(String[] args) {
		
		MxKeys keyboard = new MxKeys();
		
		keyboard.powerOn();
		keyboard.keyDown('A');
		
		System.out.println("배터리: " + keyboard.checkBattery() + "%");
		
		keyboard.powerOff();
		
	}

}

interface Keyboard {

	// 접근 제어자는 기본적으로 public이며, 생략 가능하다.
	void powerOn();
	void keyDown(char c);
	int checkBattery();
	void powerOff();
	
}

class MxKeys implements Keyboard {

	@Override
	public void powerOn() {

		System.out.println("전원을 켰습니다.");
		
	}
	
	@Override
	public void keyDown(char c) {

		System.out.println(c + " 키를 눌렀습니다.");
		
	}
	
	@Override
	public int checkBattery() {
	
		return 80;
		
	}

	@Override
	public void powerOff() {

		System.out.println("전원을 껐습니다.");
		
	}

}
