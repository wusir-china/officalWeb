package com.hw.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.bean.News;
import com.hw.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;	
	
	//1.到添加页面
	@RequestMapping(value="/toAddPage")
	public String toAddPage(){				
		return "news/add";
	}	
	//2.添加news
	@RequestMapping(value="/add")
	public String add(News news){
		newsService.add(news);
		return "redirect:toListPage";
	}
	//1.到更新页面
	@RequestMapping(value="/toEditPage")
	public String toEditPage(Model model,int id){
		model.addAttribute("news", newsService.findOne(id));
		return "news/edit";
	}
	
	//2.更新
	@RequestMapping(value="/update")
	public String update(News news,Model model){
		//model.addAttribute("news", news);
		newsService.update(news);
		return "redirect:toListPage";
	}
	//刪除
	@RequestMapping(value="/delete")
	public String delete(int id){
		//News news=newsService.findOne(id);
		newsService.delete(id);
		return "redirect:toListPage";
	}
	//到news列表
	@RequestMapping(value="/toListPage")
	public String toListPage(Model model){
		List<News> list=newsService.findAll();
		model.addAttribute("list", list);
		return "news/newsList";
	}
	//得到所有news的json数据
	//localhost:8080/officalWeb/news/datas	
	@RequestMapping(value="/datas")
	public @ResponseBody List<News> datas() {
		List<News> datas=newsService.findAll();
		return datas;
	}
	//得到倒数第8条到最后1条news的json数据
	//120.76.53.155/officalWeb/news/datasFor8
	@RequestMapping(value="/datasFor8")
	public @ResponseBody List<News> datasFor8() {
		List<News> datas=newsService.find8();
		return datas;
	}
	//按条件查询
	@RequestMapping(value="/listCondition")
	public String listCondition(Model model,HttpServletRequest request){
		String content = request.getParameter("content");
		//如果不输入条件则查询所有
		if(content!=null&&!"".equals(content)){
			List<News> list=newsService.findCondition(content);	
			model.addAttribute("list", list);
		}else{
			model.addAttribute("list", newsService.findAll());
		}		
		return "news/newsList";
	}
	
}
