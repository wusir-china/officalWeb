package com.hw.service;


import com.hw.bean.User;

public interface UserService {
		
	public User findUserByNameAndPassword(User user);
}
