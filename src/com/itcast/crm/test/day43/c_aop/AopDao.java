package com.itcast.crm.test.day43.c_aop;

public class AopDao {
	public void before(){
		System.out.println("dao层save方法执行之前，记录日志");
	}
	
}
