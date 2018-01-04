package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.bean.News;
import com.hw.dao.NewsDao;
import com.hw.service.NewsService;
@Service("newsService")  
public class NewsServiceImpl implements NewsService{
	@Autowired private NewsDao newsDao;	
	
	public void add(News news){
		newsDao.add(news);
	}
	public List<News> findAll() {
		// TODO Auto-generated method stub		
		return newsDao.findAll();
	}
	public News findOne(int id) {
		// TODO Auto-generated method stub
		return newsDao.findOne(id);
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		newsDao.delete(id);
	}
	public void update(News news) {
		// TODO Auto-generated method stub
		newsDao.update(news);
	}
	
	
	public List<News> findCondition(String newsName) {
		// TODO Auto-generated method stub
		return newsDao.findCondition(newsName);
	}
	public List<News> find8() {
		// TODO Auto-generated method stub
		return newsDao.find8();
	}
}
