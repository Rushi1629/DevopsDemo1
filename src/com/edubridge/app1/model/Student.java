package com.edubridge.app1.model;

public class Student {
	private int studentdId;
	private String studentName;
	private int studentMarks;
	public Student(int studentdId, String studentName, int studentMarks) {
		super();
		this.studentdId = studentdId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentdId=" + studentdId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
}
