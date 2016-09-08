package com.astraltear.batch.db;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Job1Processor implements ItemProcessor<DTO1, DTO1> {

	private static final Logger logger = LoggerFactory.getLogger(Job1Processor.class);

	@Override
	public DTO1 process(DTO1 item) throws Exception {
		item.setName("ItemProcessor");
		logger.info("Job1Processor {}", item.toString());
		return item;
	}

}
