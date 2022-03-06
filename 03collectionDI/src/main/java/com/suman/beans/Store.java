package com.suman.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Store {
	private int storeNo;
	private String storeName;
	private List<Staff> staffs;
	private Set<String> customers;
	private Map<String, String> mapping;

	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

	public void setCustomers(Set<String> customers) {
		this.customers = customers;
	}

	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}

	@Override
	public String toString() {
		return "Store [storeNo=" + storeNo + ", storeName=" + storeName + ", staffs=" + staffs + ", customers="
				+ customers + ", mapping=" + mapping + "]";
	}

}
