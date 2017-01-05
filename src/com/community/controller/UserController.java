package com.community.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.community.entity.User;
import com.community.service.IUserService;

@Controller
public class UserController {
	
	@Resource(name="userservice")
	private IUserService userService;
	
	@RequestMapping(value="login.do",method={RequestMethod.POST})
	public @ResponseBody boolean login(HttpServletRequest request, HttpServletResponse response) throws Exception{
//		System.out.println(request.getParameter("name"));
		boolean flag = false;
		try{
			User user1 = new User();
			user1.setUser_username(request.getParameter("name"));
			user1.setUser_password(request.getParameter("pwd"));
			if(userService.checkLogin(user1))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", user1.getUser_username());
//				System.out.println(session.getAttribute("username"));
				flag = true;
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
	@RequestMapping(value="register.do",method={RequestMethod.POST})
	public @ResponseBody boolean register(HttpServletRequest request, HttpServletResponse response) throws Exception{
		boolean flag = false;
		try{
			User user2 = new User();
			user2.setUser_username(request.getParameter("reg_username"));
			user2.setUser_password(request.getParameter("reg_password"));
			if(userService.register(user2))
			{
				flag = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
	@RequestMapping(value="loginjudge.do",method={RequestMethod.POST})
	public @ResponseBody boolean loginjudge(HttpServletRequest request, HttpServletResponse response) throws Exception{
		boolean flag = false;
		HttpSession session = request.getSession();
		String loginname = (String)session.getAttribute("username");
//		System.out.println(loginname);
		if(loginname!=null)
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}

	@RequestMapping(value="quit.do",method={RequestMethod.POST})
	public void quit(HttpServletRequest request,PrintWriter out) throws Exception{
		try{
			HttpSession session = request.getSession();
			session.removeAttribute("username");
			out.write("success");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
