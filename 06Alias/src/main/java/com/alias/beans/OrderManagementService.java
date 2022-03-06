package com.alias.beans;

import java.util.List;

public class OrderManagementService {

	private ParcelService parcelService;

	public String palceOrder(Address address, List<String> products) {
		String orderNo = "";
		String awbNo;
		if(address.getPincode() > 100000 && address.getPincode() <200000) {
			awbNo = parcelService.shipParcel(orderNo, address);
		} else {
			awbNo = parcelService.shipParcel(orderNo, address);
		}
		return orderNo;
	}
	
	public void setParcelService(ParcelService parcelService) {
		this.parcelService = parcelService;
	}
	
}
