package org.suman.test;

public class HtmlMessageFormater implements IMessageFormater {

	@Override
	public String formatMessage(String msg) {
		return "<html><body" + msg + "</body></html>";
	}

}
