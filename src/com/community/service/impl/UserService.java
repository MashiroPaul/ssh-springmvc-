package com.community.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.community.dao.IUserDAO;
import com.community.dao.impl.UserDAO;
import com.community.entity.User;
import com.community.service.IUserService;

@Service("userservice")
public class UserService implements IUserService{
	
	@Autowired
	private IUserDAO userDao;
	
	@Override
	public boolean checkLogin(User user1){
		return userDao.checkLogin(user1);
	}

	@Override
	public boolean register(User user){
		if(userDao.checkuserexist(user)){
			return false;
		}
		else{
			return userDao.register(user);
		}
	}
}
