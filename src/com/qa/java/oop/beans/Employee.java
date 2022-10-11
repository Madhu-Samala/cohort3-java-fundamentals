package com.qa.java.oop.beans;

import java.io.Serializable;
//Marker Interface
public class Employee implements Serializable {
	//Employee IS-A Serializable

	private int id;
	private String name;
	
	private String email;

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public Employee setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Employee setName(String name) {
		if (name == null)
			this.name = "";
		this.name = name;
		return this;
	}
	
	

	public String getEmail() {
		return email;
	}

	public Employee setEmail(String email) {
		this.email = email;
		return this;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
