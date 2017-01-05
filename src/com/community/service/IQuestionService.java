package com.community.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.community.entity.Question;

@Transactional
public interface IQuestionService {

	public List<Question> getquestionlist();
	
}
