package com.yym.examples.jpa.repository;

import com.yym.examples.jpa.entity.City;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/13
 */
@Repository
public interface CityRepository extends ExampleRepository<City , Long> {

	/**
	 * 这里的like不是真正的模糊匹配,前后无百分号
	 * @param countryCode
	 * @return
	 */
	List<City> findByCountryCodeIgnoreCase(String countryCode);
}