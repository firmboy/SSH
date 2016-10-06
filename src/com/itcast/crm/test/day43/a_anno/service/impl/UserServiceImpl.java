package com.itcast.crm.test.day43.a_anno.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.itcast.crm.test.day43.a_anno.dao.UserDao;
import com.itcast.crm.test.day43.a_anno.service.UserService;
import com.itcast.crm.user.domain.User;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	//@Resource(name="userDao")
	@Autowired
	@Qualifier(value="userDao")//不写value值，则视为按类型查询
	private UserDao dao;
	
	public void save(User user) {
		System.out.println("UserServiceImpl 保存用户："+user.getUsername());
		dao.save(user);
	}

}
