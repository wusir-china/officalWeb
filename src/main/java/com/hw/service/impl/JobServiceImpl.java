package com.hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.bean.Job;
import com.hw.dao.JobDao;
import com.hw.service.JobService;
@Service("jobService")  
public class JobServiceImpl implements JobService{
	@Autowired private JobDao jobDao;	
	
	public void add(Job job){
		jobDao.add(job);
	}
	public List<Job> findAll() {
		// TODO Auto-generated method stub		
		return jobDao.findAll();
	}
	public Job findOne(int id) {
		// TODO Auto-generated method stub
		return jobDao.findOne(id);
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		jobDao.delete(id);
	}
	public void update(Job job) {
		// TODO Auto-generated method stub
		jobDao.update(job);
	}
	
	
	public List<Job> findCondition(String jobName) {
		// TODO Auto-generated method stub
		return jobDao.findCondition(jobName);
	}
}
