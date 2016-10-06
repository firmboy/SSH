package com.itcast.crm.test.day43.a_anno.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itcast.crm.test.day43.a_anno.service.UserService;
import com.itcast.crm.user.domain.User;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/itcast/crm/test/day43/a_anno/applicationContext.xml")
public class AnnoTest {
	
	@Resource(name="userService")
	private UserService service;
	
	
	//@Resource(name="user")
	@Autowired
	@Qualifier()
	private User user;
	
	@Test
	public void test1(){
		service.save(user);
	}
	
	
}
