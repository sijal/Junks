package com.suman.beans;

public class Staff {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + "]";
	}

}
