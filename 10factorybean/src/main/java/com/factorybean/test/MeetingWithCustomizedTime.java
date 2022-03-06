package com.factorybean.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.factorybean.bean.CalenderFactoryBean;
import com.factorybean.bean.Meeting;

public class MeetingWithCustomizedTime {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("common/application-context.xml"));
		Meeting meet = factory.getBean("meeting", Meeting.class);
		System.out.println(meet.toString());
//		Meeting meet2 = factory.getBean("meeting", Meeting.class);
		
		Calendar Calendar1 = factory.getBean("calender", Calendar.class);
		Calendar Calendar2 = factory.getBean("calender", Calendar.class);
	}

}
