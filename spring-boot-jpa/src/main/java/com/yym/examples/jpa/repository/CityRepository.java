package com.yym.examples.jpa.repository;

import com.yym.examples.jpa.entity.City;
import org.springframework.stereotype.Repository;

/**
 * Created by yaoyimin on 2017/10/13
 */
@Repository
public interface CityRepository extends ExampleRepository<City , Long> {
}