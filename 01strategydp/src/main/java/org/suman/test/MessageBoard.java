package org.suman.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MessageBoard {
	private IMessageFormater msgFormatter = null;

	public void writeMessage(String message) throws FileNotFoundException, IOException {
		String cMsg = msgFormatter.formatMessage(message);
		System.out.println(cMsg);
	}
	public void setMsgFormatter(IMessageFormater msgFormatter) {
		this.msgFormatter = msgFormatter;
	}
}
