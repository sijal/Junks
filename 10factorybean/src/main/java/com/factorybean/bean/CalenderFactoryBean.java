package com.factorybean.bean;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalenderFactoryBean implements FactoryBean<Calendar> {
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	@Override
	public Calendar getObject() throws Exception {
		System.out.println("getObject called...");
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day, hour, minute);
		return calendar;
	}
	@Override
	public Class<?> getObjectType() {
		return Calendar.class;
	}
	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton called...");
		return false;
	}
	
}
