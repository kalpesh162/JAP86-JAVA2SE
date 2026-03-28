package com.model;

import java.io.Serializable;

// " java.io.NotSerializableException:
public class Student implements Serializable {
	// By making field as a static that part will not be serilized
	// By making field as a transient that part will not be serilized
	
	private transient int id;   // transient only allow to write with the fields
	private String name;
	private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
