package com.suman.beans;

public class HtmlMessageFormatter implements IMessageFormatter {

	@Override
	public String formatMessage(String msg) {
		return "<html><body>" + msg + "</body></html>";
	}

}
