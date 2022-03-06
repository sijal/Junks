package com.suman.DependsOn;

import java.io.IOException;
import java.util.Properties;

public class CitiesRIPropAccessor implements IAccessor {
	private String key;
	
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public String getkey() {
		return key;
	}

	@Override
	public Object getData() throws IOException {
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("citiesRI.properties"));
		return props;
	}

}
