package com.astraltear.batch.db;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Job1Writer implements ItemWriter<DTO1> {

	private static final Logger logger = LoggerFactory.getLogger(Job1Writer.class);

	
	@Override
	public void write(List<? extends DTO1> items) throws Exception {
		for (DTO1 item : items) {
			logger.info("Job1Writer {}", item.toString());
		}
	}

}
