package com.itcast.crm.test.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDemo {
	
	public static void main(String[] args){
		for(String s:args){
			System.out.println(s);
		}
		try {
			//创建一个service，保存一个客户
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/itcast/crm/test/test/applicationContext.xml");
			Object bean = context.getBean("userService");
			System.out.println(bean.getClass());
			UserServiceImpl service = (UserServiceImpl)bean;
			System.out.println();
			service.save();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/itcast/crm/test/test/applicationContext.xml");
		Object bean = context.getBean("userService");
		System.out.println(bean);
		UserServiceImpl service = (UserServiceImpl)bean;
		service.save();
	}
	
}
