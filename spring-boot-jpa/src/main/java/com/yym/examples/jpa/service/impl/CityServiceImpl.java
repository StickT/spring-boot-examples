package com.yym.examples.jpa.service.impl;

import com.yym.examples.jpa.entity.City;
import com.yym.examples.jpa.repository.CityRepository;
import com.yym.examples.jpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaoyimin on 2017/10/13
 */
@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepository;

	@Override
	public City findById(Long id) {
		return cityRepository.findOne(id);
	}
}
