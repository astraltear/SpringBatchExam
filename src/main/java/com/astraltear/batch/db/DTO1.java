package com.astraltear.batch.db;

import java.io.Serializable;
import java.util.Date;

public class DTO1 implements Serializable {

	private static final long serialVersionUID = 326215564403920176L;

	private String id;
	private String name;
	private Date date;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DTO1 [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
	
}
