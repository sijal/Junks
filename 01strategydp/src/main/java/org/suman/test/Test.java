package org.suman.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.suman.factory.AppFactory;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		MessageWriter msgWriter = (MessageWriter) AppFactory.createObject("MessageWriter.class");//new MessageWriter();
		MessageBoard msgBoard = (MessageBoard) AppFactory.createObject("MessageBoard.class");
		
		IMessageFormater htmlMsgFormatter = (IMessageFormater) AppFactory.createObject("PDFMessageFormater.class");//MessageFormatterFactory.dispalyformatter("html");
		IMessageFormater pdfMsgFormatter = (IMessageFormater) AppFactory.createObject("HTMLMessageFormater.class");//MessageFormatterFactory.dispalyformatter("html");
		
		msgWriter.setMsgFormatter(htmlMsgFormatter);
		msgBoard.setMsgFormatter(pdfMsgFormatter);
		
		msgWriter.writeMessage("Hello World!!!");
		msgBoard.writeMessage("Hello from msg board");;
	}
}
