package org.suman.test;

public class PDFMessageFormater implements IMessageFormater {

	@Override
	public String formatMessage(String msg) {
		return "<pdf>" + msg + "</pdf>";
	}

}
