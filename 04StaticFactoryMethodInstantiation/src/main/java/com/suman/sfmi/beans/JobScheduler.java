package com.suman.sfmi.beans;

import java.util.Calendar;

public class JobScheduler {
	private String jobName;
	private Calendar scheduledTime;
	private int priority;

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public void setScheduledTime(Calendar scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "JobScheduler [jobName=" + jobName + ", scheduledTime=" + scheduledTime.getTime() + ", priority=" + priority + "]";
	}

}
