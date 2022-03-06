package com.suman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suman.beans.MessageWriter;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("application-context.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		MessageWriter msgWriter = (MessageWriter) beanFactory.getBean("msgWriter");
		msgWriter.convertMsg("Hello Suman!!!");
	}
}
