package com.hw.service;

import java.util.List;

import com.hw.bean.News;

public interface NewsService {
			
	public void add(News news);
	public List<News> findAll();
	public News findOne(int id);
	public void delete(int id);
	public void update(News news);	
	public List<News> find8();
	public List<News> findCondition(String content);
}
