package com.astraltear.batch3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobListener implements JobExecutionListener {
	
	private static final Logger logger = LoggerFactory.getLogger(JobListener.class);


	@Override
	public void afterJob(JobExecution exec) {
		logger.info(">>> Job Executed afterJob: " + exec.getJobInstance().getJobName() + " : Batch Status: " + exec.getStatus());
	}

	@Override
	public void beforeJob(JobExecution exec) {
		logger.info(">>> Job Executed beforeJob: " + exec.getJobInstance().getJobName() + " : Batch Status: " + exec.getStatus());

	}

}
