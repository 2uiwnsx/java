package com.test.java.obj;

import java.util.Calendar;

public class Mouse {
	
	private String model = "M301";
	private String color = "white";
	private int price = 30000;
	private Calendar date;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {

		return String.format("%tF", this.date);
		
	}
	
	public void setDate(int year, int month, int date) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, month - 1, date);
		
		this.date = c;
		
	}
	
	public String getState() {
			
		if (this.date.get(Calendar.YEAR) <= 2021) {
				
			return "구형";
				
		} else {
				
			return "신형";
				
		}
			
	}
	
	public String info() {
		
		String temp = "[";
		
		temp += this.model + ", ";
		temp += this.color + ", ";
		temp += this.price + ", ";
		temp += String.format("%tF", this.date);
		
		temp += "]";
		
		return temp;
		
	}

}
