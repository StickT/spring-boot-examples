package com.yym.examples.jpa.controller;

import com.yym.examples.jpa.entity.City;
import com.yym.examples.jpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

	@RequestMapping(value = "/city/get/country-code" , method = RequestMethod.GET)
	public List<City> findByCountryCode(@RequestParam String countryCode){
		return cityService.findByCountryCodeLike(countryCode);
	}

}
