package com.community.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.community.entity.Question;
import com.community.service.IQuestionService;

@Controller
public class QuestionController {
	
	@Resource(name="questionservice")
	private IQuestionService questionService;
	
	@RequestMapping(value="questionlist.do",method={RequestMethod.GET})
	public @ResponseBody void getquestions(PrintWriter out){
		List<Question> questionlist = questionService.getquestionlist();
		JSONArray test = JSONArray.fromObject(questionlist);
/*		System.out.println("**************getJSONArray**************");
		System.out.println(test);*/
		out.write(test.toString());
	}

}
