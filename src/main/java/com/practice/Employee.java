package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int EmpId;
	private String EmpName;
	private String Dpt;
	private int Age;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDpt() {
		return Dpt;
	}
	public void setDpt(String dpt) {
		Dpt = dpt;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Employee(int empId, String empName, String dpt, int age) {
		super();
		EmpId = empId;
		EmpName = empName;
		Dpt = dpt;
		Age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
