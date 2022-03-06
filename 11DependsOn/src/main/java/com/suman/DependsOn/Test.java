package com.suman.DependsOn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) throws Exception {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		LoanManager manager = beanFactory.getBean("loanManager", LoanManager.class);
		manager.calculateAmount(8000, 10, "Mumbai");
	}
}
