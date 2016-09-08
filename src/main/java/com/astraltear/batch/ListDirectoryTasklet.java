package com.astraltear.batch;

import java.io.File;


import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;

public class ListDirectoryTasklet implements Tasklet {
	
	private Resource directory;

	public Resource getDirectory() {
		return directory;
	}

	public void setDirectory(Resource directory) {
		this.directory = directory;
	}

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		File dir = directory.getFile();
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getPath());
		}
		
		return RepeatStatus.FINISHED;
	}

}
