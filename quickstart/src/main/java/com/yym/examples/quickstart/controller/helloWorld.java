package com.yym.examples.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaoyimin on 2017/10/12
 */
@RestController
public class helloWorld {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String helloWorld(){
		return "Hello World!";
	}
}
