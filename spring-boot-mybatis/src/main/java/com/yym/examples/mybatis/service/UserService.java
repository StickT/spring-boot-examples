package com.yym.examples.mybatis.service;

import com.yym.examples.mybatis.MyException;
import com.yym.examples.mybatis.entity.User;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
public interface UserService {

	List<User> findAll();

	User findById(Long id);

	void create(User user) throws MyException;
}
