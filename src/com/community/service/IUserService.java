package com.community.service;

import org.springframework.transaction.annotation.Transactional;

import com.community.entity.User;

@Transactional
public interface IUserService {
	
	public boolean checkLogin(User user1);
	public boolean register(User user);

}
