package com.astraltear.batch2;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimpleBatchMain {

	public static void main(String[] args) {
		String [] springConfig = {"spring/batch/jobs/job-simple-batch.xml" };
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); // jobLauncher <-- jobRepository <-- dataSource
		Job job = (Job) context.getBean("simpleJob");
		
		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("exit status:"+execution.getStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE!!!!");
	}

}
