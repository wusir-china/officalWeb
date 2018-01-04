package com.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.bean.Job;
import com.hw.service.JobService;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	private JobService jobService;	
	
	//1.到添加页面
	@RequestMapping(value="/toAddPage")
	public String toAddPage(){				
		return "job/add";
	}	
	//2.添加Job
	@RequestMapping(value="/add")
	public String add(Job job){
		jobService.add(job);
		return "redirect:toListPage";
	}
	//1.到更新页面
	@RequestMapping(value="/toEditPage")
	public String toEditPage(Model model,int id){
		model.addAttribute("job", jobService.findOne(id));
		return "job/edit";
	}
	
	//2.更新
	@RequestMapping(value="/update")
	public String update(Job job,Model model){
		//model.addAttribute("Job", Job);
		jobService.update(job);
		return "redirect:toListPage";
	}
	//刪除
	@RequestMapping(value="/delete")
	public String delete(int id){
		//Job Job=JobService.findOne(id);
		jobService.delete(id);
		return "redirect:toListPage";
	}
	//到Job列表
	@RequestMapping(value="/toListPage")
	public String toListPage(Model model){
		List<Job> list=jobService.findAll();
		model.addAttribute("list", list);
		return "job/jobList";
	}
	//得到所有Job的json数据
	//localhost:8080/officalWeb/Job/datas	
	@RequestMapping(value="/datas")
	public @ResponseBody List<Job> datas() {
		List<Job> datas=jobService.findAll();
		return datas;
	}
	//按条件查询
	@RequestMapping(value="/listCondition")
	public String listCondition(Model model,HttpServletRequest request){
		String content = request.getParameter("jobName");
		//如果不输入条件则查询所有
		if(content!=null&&!"".equals(content)){
			List<Job> list=jobService.findCondition(content);	
			model.addAttribute("list", list);
		}else{
			model.addAttribute("list", jobService.findAll());
		}		
		return "job/jobList";
	}
	
}
