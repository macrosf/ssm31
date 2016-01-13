package com.bolo.examples.base.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bolo.examples.base.entity.User;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:service-context.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void getUserTest() {
		List<User> list = userService.getUsers();
		Assert.assertEquals(3, list.size());
	}
}
