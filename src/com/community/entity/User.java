package com.community.entity;

import javax.persistence.*;

@Entity(name="tb_user")
public class User {
	
	public User(){
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id",length=11)
	private Integer user_id;
	
	@Column(name="user_username",length=20)
	private String user_username;
	
	@Column(name="user_password",length=50)
	private String user_password;
	
	@Column(name="user_truename",length=20)
	private String user_truename;
	
	@Column(name="user_email",length=50)
	private String user_email;
	
	@Column(name="user_phone",length=15)
	private String user_phone;
	
	@Column(name="user_image",length=50)
	private String user_image;
	
	@Column(name="user_sexy",length=10)
	private String user_sexy;
	
	@Column(name="user_address",length=80)
	private String user_address;
	
	@Column(name="user_statement",length=100)
	private String user_statemet;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_truename() {
		return user_truename;
	}

	public void setUser_truename(String user_truename) {
		this.user_truename = user_truename;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_image() {
		return user_image;
	}

	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}

	public String getUser_sexy() {
		return user_sexy;
	}

	public void setUser_sexy(String user_sexy) {
		this.user_sexy = user_sexy;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_statemet() {
		return user_statemet;
	}

	public void setUser_statemet(String user_statemet) {
		this.user_statemet = user_statemet;
	}

}
