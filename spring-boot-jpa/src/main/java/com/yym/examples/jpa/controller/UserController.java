package com.yym.examples.jpa.controller;

import com.yym.examples.jpa.entity.User;
import com.yym.examples.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/get/id/{id}" , method = RequestMethod.GET)
	public User getUserById(@PathVariable Long id){
		return userService.findById(id);
	}

	@RequestMapping(value = "/user/get/age" , method = RequestMethod.GET)
	public List<User> getByAgeBetween(@RequestParam Integer after , @RequestParam Integer before){
		return userService.findByAgeBetween(after,before);
	}

	@RequestMapping(value = "/user/query" , method = RequestMethod.GET)
	public Page<User> query(@RequestParam Integer pageIndex,@RequestParam Integer pageSize){
		return userService.queryUserPage(new PageRequest(pageIndex,pageSize));
	}
}
