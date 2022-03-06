package com.nestedbeans.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nestedbeans.beans.Motor;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/nestedbeans/common/application-context1.xml"));
		BeanFactory beanFactory2 = new XmlBeanFactory(new ClassPathResource("com/nestedbeans/common/application-context2.xml"), beanFactory);
		Motor motor = beanFactory2.getBean("motor", Motor.class);
		System.out.println(motor.toString());
	}
}
