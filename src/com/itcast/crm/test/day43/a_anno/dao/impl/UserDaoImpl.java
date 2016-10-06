package com.itcast.crm.test.day43.a_anno.dao.impl;

import org.springframework.stereotype.Repository;

import com.itcast.crm.test.day43.a_anno.dao.UserDao;
import com.itcast.crm.user.domain.User;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		System.out.println("UserDaoImpl 保存用户："+user.getUsername());
		
	}

}
