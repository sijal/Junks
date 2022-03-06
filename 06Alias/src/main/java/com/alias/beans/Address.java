package com.alias.beans;

public class Address {
	private String city;
	private int pincode;

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

}
