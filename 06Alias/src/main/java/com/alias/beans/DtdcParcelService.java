package com.alias.beans;

public class DtdcParcelService implements ParcelService {

	@Override
	public String shipParcel(String orderNo, Address address) {
		String awbno = "dtdcNo1234";
		return awbno;
	}

}
