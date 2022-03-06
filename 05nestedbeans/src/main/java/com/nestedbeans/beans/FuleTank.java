package com.nestedbeans.beans;

public class FuleTank {
	private String fuleTank;
	private int capacity;

	public void setFuleType(String fuleTank) {
		this.fuleTank = fuleTank;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuleTank [fuleType=" + fuleTank + ", capacity=" + capacity + "]";
	}

}
