package com.community.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.community.entity.Question;

@Transactional
public interface IQuestionDAO {

	public List<Question> getQuestions();
}
