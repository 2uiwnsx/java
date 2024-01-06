package com.test.java.obj.cast;

public class Ex55_Casting {
	
	public static void main(String[] args) {

		LG500 lg = new LG500();
		
		Printer p1 = lg;
		
		Object o1 = lg;
		
		HP600 hp = new HP600();
		
		Printer p2 = hp;
		
		Object o2 = hp;
		
		// m1();
		
	}
	
	// Q. LG500 5대, HP600 3대가 제대로 작동하는지 확인하는 메서드를 구현하시오.
	
	private static void m1() {
		
		Printer[] ps = new Printer[8];
		
		for (int i = 0; i < ps.length; i++) {
			
			if (i < 5) {
				
				ps[i] = new LG500();
				
			} else {
				
				ps[i] = new HP600();
				
			}
			
		}
		
		for (int i = 0; i < ps.length; i++) {
			
			ps[i].print();
			
			if (ps[i] instanceof LG500) {
				
				((LG500)ps[i]).selfTest();
				
			} else {
				
				((HP600)ps[i]).clean();
				
			}
			
		}
		
	}

}

interface Printer {
	
	public void powerOn();
	public void print();
	public void powerOff();
	
}

class LG500 implements Printer {
	
	private String type;
	private int price;
	
	@Override
	public void powerOn() {

		System.out.println("전원을 켰습니다.");
		
	}
	
	@Override
	public void print() {
		
		System.out.printf("출력합니다.");
		
	}
	
	public void selfTest() {
		
		System.out.println("자가 점검을 실시합니다.");
		
	}

	@Override
	public void powerOff() {

		System.out.println("전원을 껐습니다.");
		
	}

}

class HP600 implements Printer {
	
	private String color;
	private int price;
	
	@Override
	public void powerOn() {
		
		System.out.println("전원을 켰습니다.");
		
	}
	
	@Override
	public void print() {
		
		System.out.println("출력합니다.");
		
	}
	
	public void clean() {
		
		System.out.println("헤더를 정리합니다.");
		
	}
	
	@Override
	public void powerOff() {
		
		System.out.println("전원을 껐습니다.");
		
	}

}
