package com.test.java.obj;

public class Cup {
	
	private String color;
	private int size;
	
	/*
		▶ 생성자명은 클래스명과 동일하다.
		▶ 반환값을 가질 수 없으므로, 반환값의 자료형을 명시하지 않는다.
	*/
	
	public Cup() {
		
		this.color = "yellow";
		this.size = 300;
		
	}

	public Cup(String color) {

		// 클래스 내의 다른 생성자를 호출할 수 있다.
		this(color, 300);
		
	}
	
	public Cup(int size) {
		
		this.color = "yellow";
		
		if (size > 0 && size < 3000) {
			
			this.size = size;
			
		}
		
	}
	
	public Cup(String color, int size) {
		
		if (color.equals("yellow") || color.equals("green") || color.equals("orange") || color.equals("pink")) {
			
			this.color = color;
			
		}

		if (size > 0 && size < 3000) {
			
			this.size = size;
			
		}
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String info() {
		
		return ("색상: " + this.color + ", 크기: " + this.size);
		
	}

}
