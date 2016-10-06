package com.itcast.crm.test.day43.c_aop;

import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {


	public void save() {
		System.out.println("dao层的save方法执行");
		
	}
	
	
}
