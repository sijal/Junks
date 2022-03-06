package org.suman.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MessageWriter {
	private IMessageFormater msgFormatter = null;

	public void writeMessage(String message) throws FileNotFoundException, IOException {
		String cMsg = "";
//		msgFormatter = new PDFMessageFormater();
//		msgFormatter = MessageFormatterFactory.dispalyformatter("pdf");
		cMsg = msgFormatter.formatMessage(message);
		System.out.println(cMsg);
	}
	public void setMsgFormatter(IMessageFormater msgFormatter) {
		this.msgFormatter = msgFormatter;
	}
}
