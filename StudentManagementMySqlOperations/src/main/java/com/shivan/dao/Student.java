package com.shivan.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Student {
	@Id
    private String studentId;
    private String studentName;
    private String city;
    private String marks;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public Student(String studentId, String studentName, String city, String marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
		this.marks = marks;
	}
	public Student() {
		super();
	}
    
    
}
