package com.itcast.crm.test.day43.b_proxy;

import org.springframework.stereotype.Component;

@Component(value="userService")
public class UserServiceImpl implements UserService {

	public void save(){
		System.out.println("UserService 保存....");
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		return super.equals(obj);
	}
	@Override
	public String toString() {
		System.out.println("toString");
		return super.toString();
	}
	
}
