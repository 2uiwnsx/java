package com.test.java.obj.inheritance;

public class Ex49_static {
	
	public static void main(String[] args) {
		
		// Q. 펜의 개수를 출력하시오.
		
		Pen pen1 = new Pen("Monami", "black");
		Pen pen2 = new Pen("Monami", "blue");
		Pen pen3 = new Pen("Monami", "red");
		
		System.out.println("개수: " + Pen.count);
		
	}

}

class Pen {
	
	public static int count = 0;
	private String model;
	private String color;
	
	public Pen(String model, String color) {
		
		Pen.count++;
		this.model = model;
		this.color = color;
		
	}

	@Override
	public String toString() {
		
		return "Pen [model=" + model + ", color=" + color + "]";
		
	}

}
