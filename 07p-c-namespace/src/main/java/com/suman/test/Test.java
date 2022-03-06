package com.suman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suman.p_c_namespace.Address;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		Address add = beanFactory.getBean("address", Address.class);
		System.out.println(add.toString());
	}
}
