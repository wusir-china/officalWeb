package com.hw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hw.bean.User;
import com.hw.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String pwd,Model model) {
		User user=new User();
		user.setUsername(username);
		user.setPwd(pwd);
		User currentUser=userService.findUserByNameAndPassword(user);
		if(currentUser!=null){	
			model.addAttribute("user", currentUser);
			return "main";//redirect:
		}else{
			model.addAttribute("error", "登录失败");
			return "login";
		}
	}
	//120.76.53.155/officalWeb/users/toLoginPage	
	@RequestMapping(value="/toLoginPage")
	public String toLoginPage() {
		return "login";
	}
	
}
