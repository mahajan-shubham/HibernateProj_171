package com.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studId;
	private String StudName;
	private String city;
	private int Age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Student(int studId, String studName, String city, int age) {
		super();
		this.studId = studId;
		StudName = studName;
		this.city = city;
		Age = age;
	}
	
	

}
