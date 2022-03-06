package com.factorybean.bean;

import java.util.Arrays;
import java.util.Calendar;

public class Meeting {
	private String agenda;
	private String[] members;
	private Calendar calender;
	
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public void setMembers(String[] members) {
		this.members = members;
	}
	public void setCalender(Calendar calender) {
		this.calender = calender;
	}
	@Override
	public String toString() {
		return "Meeting [agenda=" + agenda + ", members=" + Arrays.toString(members) + ", calender=" + calender.getTime() + "]\n";
	}
	
}
