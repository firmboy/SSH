package com.itcast.crm.test.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;

public class SpringTest {
	
	public static void main(String[] args){
		for(String s:args){
			System.out.println(s);
		}
		try {
			//创建一个service，保存一个客户
			Customer customer = new Customer();
			customer.setCust_name("小泽");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService service = (CustomerService)context.getBean("customerService");
			System.out.println(service.getClass());
			service.save(customer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 测试spring的aop模块，就是说要给service层的save方法的前后加上两句话
	 */
	@Test
	public void test2(){
		try {
			//创建一个service，保存一个客户
			Customer customer = new Customer();
			customer.setCust_name("小泽");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService service = (CustomerService)context.getBean("customerService");
			service.save(customer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 基础的spring
	 */
	@Test
	public void test1(){
		try {
			//创建一个service，保存一个客户
			Customer customer = new Customer();
			customer.setCust_name("小泽");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService service = (CustomerService)context.getBean("customerService");
			System.out.println(service.getClass());
			service.save(customer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
