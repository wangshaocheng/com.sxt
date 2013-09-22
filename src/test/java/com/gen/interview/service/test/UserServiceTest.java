package com.gen.interview.service.test;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sxt.service.UserService;

public class UserServiceTest extends TestCase {

	public void testSave() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				new String[] { "dao-config.xml", "hib-config.xml", "service-config.xml"});
		UserService userService = (UserService) beanFactory
				.getBean("userService");

		userService.add("aa");

		System.out.println(userService);
	}
}
