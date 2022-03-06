package com.suman.beanlifecycle;

public class Math_DeclarativeExample {
	private int i;
	private int j;
	private int sum;
	
	public Math_DeclarativeExample(int i) {
		this.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public void init() { // Post Constrution Activity
		this.sum = this.i + this.j;
		System.out.println("init called...");
	}
	public void release() { // Pre-Destruction Activity
		this.sum = 0;
		System.out.println("release called...");
	}
	@Override
	public String toString() {
		return "Math_DeclarativeExample [i=" + i + ", j=" + j + ", sum=" + sum + "]";
	}
	
}
