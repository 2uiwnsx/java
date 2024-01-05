/*
	▶ 반드시 private으로 멤버 변수를 선언해야 한다.
	▶ 멤버 변수에 접근할 때는 Getter 메서드와 Setter 메서드를 사용한다.	
	▶ 지역 변수가 멤버 변수보다 우선적으로 적용된다.
	▶ 매개변수명과 멤버 변수명이 동일한 경우, this 키워드를 사용하여 멤버 변수임을 명시한다.
	▶ this는 현재 객체를 가리키는 키워드다.
*/

package com.test.java.obj;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private int page;
	private int price;

	public void aaa(String a) {
		
		title = a;
		
	}
	
	public void bbb(int b) {
		
		if (b >= 0 && b <= 100000) {
			
			price = b;
			
		} else {
			
			System.out.println("올바른 가격이 아닙니다.");
			
		}
		
	}
	
	public int ccc() {
		
		return price;
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
}
