package org.suman.factory;

import org.suman.test.HtmlMessageFormater;
import org.suman.test.IMessageFormater;
import org.suman.test.PDFMessageFormater;

public class MessageFormatterFactory {
	public static IMessageFormater dispalyformatter(String type) {
		IMessageFormater messageFormater = null;
		if(type.equals("pdf")) {
			messageFormater = new PDFMessageFormater();
		} else if(type.equals("html")) {
			messageFormater = new HtmlMessageFormater();
		}
		return messageFormater;
	}
}
