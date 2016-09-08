package com.astraltear.batch.db;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Job1Reader implements ItemReader<DTO1> {

	private static final Logger logger = LoggerFactory.getLogger(Job1Reader.class);
	
	private String id;
	private int count;
	
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public DTO1 read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if (count >= 1) return null;
		count++;
		
		DTO1 item = new DTO1();
		item.setId(this.id);
		item.setName(Thread.currentThread().getName());
		item.setDate(new Date());
		
		logger.info("Job1Reader {}", item.toString());
		return item;
	}

}
