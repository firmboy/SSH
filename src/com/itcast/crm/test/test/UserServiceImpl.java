package com.itcast.crm.test.test;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl {
	
	public void save(){
		System.out.println("userServiceImpl 执行保存方法....");
	}
	
}
