package com.suman.beanlifecycle.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suman.beanlifecycle.Rectangle_ProgramaticExample;
import com.suman.beanlifecycle.hook.ShutdownHook;

public class ProgramaticTest {
	public static void main(String[] args) {
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("beanlifecycle/common/application-context1.xml"));
		Rectangle_ProgramaticExample rec = bean.getBean("rec", Rectangle_ProgramaticExample.class);
		System.out.println(rec.toString());
		
		ShutdownHook hook = bean.getBean("hook", ShutdownHook.class);
		Runtime.getRuntime().addShutdownHook(new Thread(hook));
		
	}
}
