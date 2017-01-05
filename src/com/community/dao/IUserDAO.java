package com.community.dao;

import org.springframework.transaction.annotation.Transactional;

import com.community.entity.User;

@Transactional
public interface IUserDAO {
	
	public boolean checkLogin(User user1);
	public boolean checkuserexist(User user);
	public boolean register(User user);
	
}
