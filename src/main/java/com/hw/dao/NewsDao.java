package com.hw.dao;

import java.util.List;


import com.hw.bean.News;

public interface NewsDao {
	void add(News news);
	
	void update(News news);
	
	void delete(int id);
	
	News findOne(int id);
	
	List<News> findAll();
	List<News> find8();
	//以下二个为分页	
//	List<News> findPage(int begin, int pageSize);
//
//	int findCount();
	//按条件查找
	List<News> findCondition(String content);
		
}

