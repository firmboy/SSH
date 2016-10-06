package com.itcast.crm.test.day43.c_aop;

public class AopService {
	
	
	public void before(){
		System.out.println("service层save方法执行之前:开启事务");
	}
	
	public void commit(){
		System.out.println("service层save方法执行之后：提交事务");
	}
	
	public void rollback(){
		System.out.println("service层save方法执行之后：事务回滚");
	}
}
