package com.suman.beanlifecycle.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.suman.beanlifecycle.Math_DeclarativeExample;
import com.suman.beanlifecycle.hook.ShutdownHook;

public class DeclarativeTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanlifecycle/common/application-context1.xml"));
		Math_DeclarativeExample math = factory.getBean("math", Math_DeclarativeExample.class);
		System.out.println(math.toString());
//		((ConfigurableListableBeanFactory)factory).destroySingletons(); 
		/**This is wrong, we are calling this because we know program termination point
		 * but what if program terminates abruptly then we need to tell JVM to notify IOC if its getting terminated
		 * */
		ShutdownHook hook = factory.getBean("hook", ShutdownHook.class);
		Runtime.getRuntime().addShutdownHook(new Thread(hook));
	}
}
