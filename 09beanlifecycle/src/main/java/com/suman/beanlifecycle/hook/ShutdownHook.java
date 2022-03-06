package com.suman.beanlifecycle.hook;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutdownHook implements Runnable, BeanFactoryAware {

	BeanFactory factory;
	@Override
	public void run() {
		((ConfigurableListableBeanFactory) factory).destroySingletons();
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.factory = beanFactory;
	}
	
}
