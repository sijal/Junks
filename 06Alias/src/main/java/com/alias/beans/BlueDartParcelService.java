package com.alias.beans;

public class BlueDartParcelService implements ParcelService {

	@Override
	public String shipParcel(String orderNo, Address address) {
		String awbNo = "bd1234";
		return awbNo;
	}

}
