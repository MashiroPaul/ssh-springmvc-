package com.community.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.community.dao.IQuestionDAO;
import com.community.entity.Question;
import com.community.service.IQuestionService;

@Service("questionservice")
public class QuestionService implements IQuestionService{
	
	@Autowired
	private IQuestionDAO questionDao;
	
	@Override
	public List<Question> getquestionlist(){
		return questionDao.getQuestions();
	}

}
