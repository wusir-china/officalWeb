package com.hw.bean;


public class News {	
	private int id;
	private String content;
	private String dates;
	
	public News(String content, String dates) {
		super();
		this.content = content;
		this.dates = dates;
	}
	public News() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}	
	
}

