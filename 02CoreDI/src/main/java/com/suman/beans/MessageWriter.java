package com.suman.beans;

public class MessageWriter {
	private IMessageFormatter iMsgFormatter;
	public void convertMsg(String msg) {
		String cMsg = iMsgFormatter.formatMessage(msg);
		System.out.println(cMsg);
	}
	public void setiMsgFormatter(IMessageFormatter iMsgFormatter) {
		this.iMsgFormatter = iMsgFormatter;
	}
}
