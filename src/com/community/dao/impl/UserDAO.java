package com.community.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.community.dao.IUserDAO;
import com.community.entity.User;

@Repository
public class UserDAO implements IUserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public boolean checkLogin(User user1){
		boolean flag = false;
		String hql = "from tb_user where user_username=?0 and user_password=?1";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("0", user1.getUser_username());
		query.setParameter("1", user1.getUser_password());
		if(query.list().size()!=0)
		{
			flag = true;
//			System.out.println(flag);
		}
		return flag;
	}
	
	@Transactional //验证是否已经存在用户
	public boolean checkuserexist(User user){
		boolean flag = true;
		String hql = "from tb_user where user_username=?0";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("0", user.getUser_username());
		if(query.list().size()==0)
		{
			flag =false;
//			System.out.println("不存在");
		}
		return flag;
	}
	
	@Transactional
	public boolean register(User user){
		boolean flag = false;
		try{
			Session session = sessionFactory.getCurrentSession();
			user.setUser_username(user.getUser_username());
			user.setUser_password(user.getUser_password());
			session.save(user);
			flag = true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
}
