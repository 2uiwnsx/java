package com.test.java.auth.data;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String lv;

	public Member(String id, String pw, String name, String lv) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.lv = lv;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLv() {
		return lv;
	}

	public void setLv(String lv) {
		this.lv = lv;
	}

	@Override
	public String toString() {
		
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", lv=" + lv + "]";
		
	}
	
}
