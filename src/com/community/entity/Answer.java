package com.community.entity;

import javax.persistence.*;

@Entity(name="tb_answer")
public class Answer {
	
	public Answer(){
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="as_id",length=11)
	private Integer as_id;
	
	@Column(name="qt_id",length=11)
	private Integer qt_id;
	
	@Column(name="as_content",length=100)
	private String as_content;
	
	@Column(name="as_time")
	private String as_time;
	
	@Column(name="as_username")
	private String as_username;

	public Integer getAs_id() {
		return as_id;
	}

	public void setAs_id(Integer as_id) {
		this.as_id = as_id;
	}

	public Integer getQt_id() {
		return qt_id;
	}

	public void setQt_id(Integer qt_id) {
		this.qt_id = qt_id;
	}

	public String getAs_content() {
		return as_content;
	}

	public void setAs_content(String as_content) {
		this.as_content = as_content;
	}

	public String getAs_time() {
		return as_time;
	}

	public void setAs_time(String as_time) {
		this.as_time = as_time;
	}

	public String getAs_username() {
		return as_username;
	}

	public void setAs_username(String as_username) {
		this.as_username = as_username;
	}
	
}
