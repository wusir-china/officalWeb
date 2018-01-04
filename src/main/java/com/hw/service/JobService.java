package com.hw.service;

import java.util.List;

import com.hw.bean.Job;

public interface JobService {
			
	public void add(Job job);
	public List<Job> findAll();
	public Job findOne(int id);
	public void delete(int id);
	public void update(Job job);	
	
	public List<Job> findCondition(String content);
}
