package com.itcast.crm.test.spring;

public class Aop {
	
	public void before(){
		System.out.println("方法执行前");
	}
	
	public void after(){
		System.out.println("方法执行后");
	}
}
