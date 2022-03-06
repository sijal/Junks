package com.suman.DependsOn;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private Map<String, Object> data;
	private static Cache cache;
	
	private Cache() {
		data = new ConcurrentHashMap<String, Object>();
	}
	public static synchronized Cache init() {
		if(cache != null) return cache;
		else return new Cache();
	}
	public void put(String key, Object val) {
		data.put(key, val);
	}
	public boolean isContainKey(String key) {
		return data.containsKey(key);
	}
	public Object getObject(String key) {
		return data.get(key);
	}
}
