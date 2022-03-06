package com.cpe.editor;

import java.beans.PropertyEditorSupport;

import com.cpe.bean.GeoLocation;

public class GeoLocationPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) {
		String[] tokenizer = text.split(",");
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLat(tokenizer[0]);
		geoLocation.setLng(tokenizer[1]);
		
		super.setValue(geoLocation);
	}
}
