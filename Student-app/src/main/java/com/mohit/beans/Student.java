package com.mohit.beans;

import java.time.LocalDate;

public class Student {
  private int studentId;
  private String studentName;
  private LocalDate dob;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

public Student() {}


public Student(int studentId, String studentName, LocalDate dob) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.dob = dob;
}
  
}