package com.astraltear.batch3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListener implements StepExecutionListener {
	
	private static final Logger logger = LoggerFactory.getLogger(StepListener.class);

	
	@Override
	public ExitStatus afterStep(StepExecution exec) {
		logger.info("### Step afterStep Executed: " + exec.getStepName());
		return null;
	}

	@Override
	public void beforeStep(StepExecution exec) {
		logger.info("### Step  beforeStep Executed: " + exec.getStepName());

	}

}
