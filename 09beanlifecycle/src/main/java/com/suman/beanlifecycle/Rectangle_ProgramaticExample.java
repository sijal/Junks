package com.suman.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle_ProgramaticExample implements InitializingBean, DisposableBean {
	int len;
	int br;
	int area;
	
	public void setLen(int len) {
		this.len = len;
	}
	public void setBr(int br) {
		this.br = br;
	}
	@Override
	public String toString() {
		return "Rectangle_ProgramaticExample [len=" + len + ", br=" + br + ", area=" + area + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method called...");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		this.area = this.br * this.len;
		System.out.println("afterPropertiesSet method called...");
	}
	
}
