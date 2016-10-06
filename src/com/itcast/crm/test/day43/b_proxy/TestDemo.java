package com.itcast.crm.test.day43.b_proxy;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/itcast/crm/test/day43/b_proxy/applicationContext.xml")
public class TestDemo {
	
	@Resource(name="userServiceProxy")
	private UserService service;
	
	
	@Test
	public void test1(){
		service.save();
	}
	
}
