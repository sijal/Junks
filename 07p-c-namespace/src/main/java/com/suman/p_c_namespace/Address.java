package com.suman.p_c_namespace;

public class Address {
	private String city;
	private String pincode;

	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
}
