package com.hw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.bean.User;
import com.hw.dao.UserDao;
import com.hw.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public User findUserByNameAndPassword(User user){		
		return userDao.loginUser(user);
	}
}
