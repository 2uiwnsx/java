package com.test.java.obj;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int lv;

	public Member(String id, String pw, String name, int lv) {

		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
		
	}
	
	public String info() {
		
		return String.format("아이디: %s\n암호: %s\n이름: %s\n등급: %d", this.id, this.pw, this.name, this.lv);
		
	}

}
