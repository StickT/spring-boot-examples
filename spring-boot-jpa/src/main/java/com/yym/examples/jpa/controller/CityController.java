package com.yym.examples.jpa.controller;

import com.yym.examples.jpa.entity.City;
import com.yym.examples.jpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaoyimin on 2017/10/13
 */
@RestController
public class CityController {

	@Autowired
	CityService cityService;

	@RequestMapping(value = "/city/get/id/{id}" , method = RequestMethod.GET)
	public City findById(@PathVariable Long id){
		return cityService.findById(id);
	}

}
