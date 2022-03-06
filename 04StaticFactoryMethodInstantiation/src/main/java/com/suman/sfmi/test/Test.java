package com.suman.sfmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suman.sfmi.beans.JobScheduler;

public class Test {
	public static void main(String[] args) {
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		JobScheduler scheduler = bean.getBean("scheduler", JobScheduler.class);
		System.out.println(scheduler.toString());
	}
}
