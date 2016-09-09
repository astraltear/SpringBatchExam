package com.astraltear.batch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Batch3Main {

	public static void main(String[] args) {
		
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring/batch/jobs/job-batch3.xml");
			JobRuntime jobRuntime = context.getBean("runtime",JobRuntime.class);
			jobRuntime.launch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
