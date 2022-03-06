package com.suman.DependsOn;

import java.util.Properties;

public class LoanManager {
	private Cache cache;
	public void calculateAmount(long principle, int period, String city) throws Exception {
		float rate = getRate(city);
		double amount = (principle * period * rate) / 100;
		System.out.println("amount : " + amount);
	}
	public float getRate(String city) throws Exception {
		Properties props = null;
		if (cache == null) {
			throw new Exception("Cache is Empty");
		}
		if(cache != null) {
			if(!cache.isContainKey("ri")) {
				throw new Exception("Property file not loaded");
			} else {
				props = (Properties)cache.getObject("ri");
			}
		}
		float rate =Float.parseFloat(props.getProperty(city));
		return rate;
	}
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	
}
