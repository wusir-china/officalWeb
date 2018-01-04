package com.hw.dao;

import java.util.List;


import com.hw.bean.Job;

public interface JobDao {
	void add(Job job);
	
	void update(Job job);
	
	void delete(int id);
	
	Job findOne(int id);
	
	List<Job> findAll();
	//以下二个为分页	
//	List<Job> findPage(int begin, int pageSize);
//
//	int findCount();
	//按条件查找
	List<Job> findCondition(String content);
		
}

