package com.yym.examples.jpa.service;

import com.yym.examples.jpa.entity.City;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/13
 */
public interface CityService {

	City findById(Long id);

	List<City> findByCountryCodeLike(String countryCode);
}
