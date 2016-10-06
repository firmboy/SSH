package com.itcast.crm.test.day43.c_aop;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl {
	
	@Resource(name="userDao")
	private UserDao dao;
	
	public void save(){
		System.out.println("service层的save方法执行");
		dao.save();
		//int num = 1/0;
		dao.save();
	}
}
