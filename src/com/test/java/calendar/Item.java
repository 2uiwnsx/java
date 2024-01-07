package com.test.java.calendar;

public class Item {

	private String seq;
	private String date;
	private String title;

	public Item(String seq, String date, String title) {
		
		this.seq = seq;
		this.date = date;
		this.title = title;
		
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		
		return "Item [seq=" + seq + ", date=" + date + ", title=" + title + "]";
		
	}

}
