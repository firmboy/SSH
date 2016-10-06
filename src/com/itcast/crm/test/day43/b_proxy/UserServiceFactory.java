package com.itcast.crm.test.day43.b_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component(value="userServiceFactory")
public class UserServiceFactory {
	@Resource(name="userService")
	private UserService userService;
	/*public void setUserService(UserService userService) {
		this.userService = userService;
	}*/
	

	public UserService getInstance(){
		
		return (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), 
				userService.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
						//if("save".equals(paramMethod.getName())){
							System.out.println("save方法执行之前");
							return paramMethod.invoke(userService,paramArrayOfObject);
						//}
						//return paramMethod.invoke(userService,paramArrayOfObject);
					}
				});
	}
}
