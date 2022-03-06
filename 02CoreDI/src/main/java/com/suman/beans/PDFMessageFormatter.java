package com.suman.beans;

public class PDFMessageFormatter implements IMessageFormatter {

	@Override
	public String formatMessage(String msg) {
		return "<pdf>" + msg + "</pdf>";
	}

}
