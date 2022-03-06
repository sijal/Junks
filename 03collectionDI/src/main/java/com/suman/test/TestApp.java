package com.suman.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suman.beans.Store;

public class TestApp {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/suman/common/application-context.xml"));
		Store store = beanFactory.getBean("store", Store.class);
		System.out.println(store.toString());
	}
}
