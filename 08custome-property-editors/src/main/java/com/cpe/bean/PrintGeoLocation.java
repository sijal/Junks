package com.cpe.bean;

public class PrintGeoLocation {
	private GeoLocation loc;

	public GeoLocation getLoc() {
		return loc;
	}

	public void setLoc(GeoLocation loc) {
		this.loc = loc;
	}
	public void m1() {
		System.out.println(loc);
	}
}
