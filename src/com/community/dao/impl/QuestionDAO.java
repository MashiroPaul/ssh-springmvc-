package com.community.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.community.dao.IQuestionDAO;
import com.community.entity.Question;

@Repository
public class QuestionDAO implements IQuestionDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Question> getQuestions(){
		List<Question> list = new ArrayList<Question>();
		String hql = "from tb_question";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		list=query.list();
//		System.out.println(query.list());
		return list;
	}

}






