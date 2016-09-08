package com.astraltear.batch.schedule;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
import com.astraltear.batch.model.Report;

public class CustomWriter implements ItemWriter<Report> {

	@Override
	public void write(List<? extends Report> items) throws Exception {
		System.out.println("writer..." + items.size());		
		for(Report item : items){
			System.out.println(item);
		}
		
	}

}
