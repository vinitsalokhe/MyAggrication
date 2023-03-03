package com.xyz;

import java.util.Arrays;

public class Student {

	int id;
	String name;
	Address[] add;

	public Student() {
		super();
	}

	public Student(int id, String name, Address[] add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
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

	public Address[] getAdd() {
		return add;
	}

	public void setAdd(Address[] add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + Arrays.toString(add) + "]";
	}

}
