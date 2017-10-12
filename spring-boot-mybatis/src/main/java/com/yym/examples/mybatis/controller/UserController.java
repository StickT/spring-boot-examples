package com.yym.examples.mybatis.controller;

import com.yym.examples.mybatis.entity.User;
import com.yym.examples.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/all", method = RequestMethod.GET)
	public List<User> findAll(){
		return userService.findAll();
	}

	@RequestMapping(value = "/user/get/{id}" , method = RequestMethod.GET)
	public User findById(@PathVariable Long id){
		return userService.findById(id);
	}
}
