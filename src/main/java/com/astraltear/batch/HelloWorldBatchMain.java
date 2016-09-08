package com.astraltear.batch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorldBatchMain {

	public static void main(String[] args) {
		String [] springConfig = {"spring/batch/jobs/job-hello-world.xml" };
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); // jobLauncher <-- jobRepository <-- dataSource
		Job job = (Job) context.getBean("helloWorldJob");
		Job job2 = (Job) context.getBean("reportJob");
		
		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("exit status:"+execution.getStatus());
			
			execution = jobLauncher.run(job2, new JobParameters());
			System.out.println("exit status:"+execution.getStatus());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE!!!!");
	}

}
