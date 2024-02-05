package com.test.java.data;

public class Student {
	
	private String no;
	private String name;
	private String gradeNo;
	private String classNo;
	private String studentNo;

	public Student(String no, String name, String gradeNo, String classNo, String studentNo) {
		
		this.no = no;
		this.name = name;
		this.gradeNo = gradeNo;
		this.classNo = classNo;
		this.studentNo = studentNo;
		
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		
		return "Student [no=" + no + ", name=" + name + ", gradeNo=" + gradeNo + ", classNo=" + classNo + ", studentNo=" + studentNo + "]";
		
	}

}
