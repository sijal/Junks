package com.cpe.bean;

public class GeoLocation {
	private String lat;
	private String lng;

	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "GeoLocation [lat=" + lat + ", lng=" + lng + "]";
	}
}
