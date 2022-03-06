package com.nestedbeans.beans;

public class Motor {
	private String serialNo;
	private FuleTank fuleTank;

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public void setFuleTank(FuleTank fuleTank) {
		this.fuleTank = fuleTank;
	}

	@Override
	public String toString() {
		return "Motor [serialNo=" + serialNo + ", fuleTank=" + fuleTank + "]";
	}

}
