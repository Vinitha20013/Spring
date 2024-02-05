 package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + "]";
	}

	
	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Id
	private int rollNo;
	}

