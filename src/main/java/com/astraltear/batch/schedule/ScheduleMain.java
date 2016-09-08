package com.astraltear.batch.schedule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScheduleMain {

	public static void main(String[] args) {
		String springConfig = "spring/batch/jobs/job-schedule.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

	}

}
