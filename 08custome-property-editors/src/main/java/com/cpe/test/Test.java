package com.cpe.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cpe.bean.PrintGeoLocation;
import com.cpe.editor.GeoLocationPropertyEditor;

import Registerar.GlobalPropertyEditorRegistrar;

public class Test {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/common/application-context.xml"));
		((ConfigurableListableBeanFactory) beanFactory).addPropertyEditorRegistrar(new GlobalPropertyEditorRegistrar()); 
		PrintGeoLocation print = beanFactory.getBean("print", PrintGeoLocation.class);
		print.m1();
	}
}
