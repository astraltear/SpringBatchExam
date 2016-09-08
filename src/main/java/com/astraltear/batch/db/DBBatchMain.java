package com.astraltear.batch.db;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBBatchMain {

	private static final Logger logger = LoggerFactory.getLogger(DBBatchMain.class);

	
	public static void main(String[] args) {
		String[] springConfig = { "spring/batch/jobs/batch-db.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); // jobLauncher <-- jobRepository <-- dataSource
		Job job = (Job) context.getBean("dbjob1");
		
		JobParameters jobParameters = new JobParametersBuilder().addString("id", UUID.randomUUID().toString()).toJobParameters();
		
		try {
			JobExecution execution =jobLauncher.run(job, jobParameters);
			
			logger.info("ID>>>>"+execution.getJobParameters().getString("id"));
			System.out.println("exit status:"+execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE!!!!");
	}

}
