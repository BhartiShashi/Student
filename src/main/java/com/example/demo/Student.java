package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int roll;
	
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

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
	

}
