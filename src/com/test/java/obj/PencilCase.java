package com.test.java.obj;

import java.util.Arrays;

public class PencilCase {
	
	private String color;
	private Pencil[] pencil = new Pencil[5];
	private int index = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void add(Pencil p) {
		
		if (this.index < this.pencil.length) {
			
			this.pencil[this.index] = p;
			
			this.index++;
			
		} else {
			
			System.out.println("연필을 필통에 넣을 수 없습니다.");
			
		}
		
	}
	
	public Pencil get(int index) {
		
		Pencil p = this.pencil[index];
		
		for (int i = index; i < this.pencil.length - 1; i++) {
			
			this.pencil[i] = this.pencil[i + 1];
			
		}
		
		this.pencil[this.pencil.length - 1] = null;
		
		this.index--;
		
		return p;
		
	}
	
	public String info() {
		
		return Arrays.toString(this.pencil);
		
	}

}
