package com.itcast.crm.test.hibernate;

import org.junit.Test;

import com.itcast.crm.customer.domain.Customer;
import com.itcast.crm.customer.service.CustomerService;
import com.itcast.crm.customer.service.impl.CustomerServiceImpl;

public class HibernateTest {
	
	@Test
	public void test1(){
		try {
			//创建一个service，保存一个客户
			Customer customer = new Customer();
			customer.setCust_name("小泽");
			CustomerService service = new CustomerServiceImpl();
			service.save(customer);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
