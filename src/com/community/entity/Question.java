package com.community.entity;

import javax.persistence.*;

@Entity(name="tb_question")
public class Question {
	
	public Question(){
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="qt_id",length=11)
	private Integer qt_id;
	
	@Column(name="qt_title",length=50)
	private String qt_title;
	
	@Column(name="qt_question",length=100)
	private String qt_question;
	
	@Column(name="qt_readnum",length=100)
	private String qt_readnum;
	
	@Column(name="qt_answernum",length=5)
	private String qt_answernum;
	
	@Column(name="qt_time")
	private String qt_time;
	
	@Column(name="qt_type",length=20)
	private String qt_type;
	
	@Column(name="user_username",length=20)
	private String user_username;

	public Integer getQt_id() {
		return qt_id;
	}

	public void setQt_id(Integer qt_id) {
		this.qt_id = qt_id;
	}

	public String getQt_question() {
		return qt_question;
	}

	public String getQt_title() {
		return qt_title;
	}

	public void setQt_title(String qt_title) {
		this.qt_title = qt_title;
	}
	
	public void setQt_question(String qt_question) {
		this.qt_question = qt_question;
	}

	public String getQt_readnum() {
		return qt_readnum;
	}

	public void setQt_readnum(String qt_readnum) {
		this.qt_readnum = qt_readnum;
	}

	public String getQt_answernum() {
		return qt_answernum;
	}

	public void setQt_answernum(String qt_answernum) {
		this.qt_answernum = qt_answernum;
	}

	public String getQt_time() {
		return qt_time;
	}

	public void setQt_time(String qt_time) {
		this.qt_time = qt_time;
	}

	public String getQt_type() {
		return qt_type;
	}

	public void setQt_type(String qt_type) {
		this.qt_type = qt_type;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
}
