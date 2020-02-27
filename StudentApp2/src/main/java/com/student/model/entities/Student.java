package com.student.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table1")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int standard;
	private String sec;
	private String address;
	private String phoneno;

	public Student(String name, int standard, String sec, String address, String phoneno) {

		this.name = name;
		this.standard = standard;
		this.sec = sec;
		this.address = address;
		this.phoneno = phoneno;
	}
	
	public Student() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", sec=" + sec + ", address="
				+ address + ", phoneno=" + phoneno + "]";
	}

}
