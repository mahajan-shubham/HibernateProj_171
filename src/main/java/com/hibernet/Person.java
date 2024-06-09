package com.hibernet;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="person_info")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	@Column(name="person_name",length=20,nullable=false)
	private String name;
	
	
	public Person(String name, int age, Date jdate, int salary) {
		super();
		
		this.name = name;
		this.age = age;
		this.jdate = jdate;
		this.salary = salary;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Transient
	private int age;
	
	
	@Temporal(TemporalType.DATE)
	private Date jdate;
	private int salary;
}
