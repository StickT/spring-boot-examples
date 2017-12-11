package com.yym.examples.mybatis.service.impl;

import com.yym.examples.mybatis.MyException;
import com.yym.examples.mybatis.entity.User;
import com.yym.examples.mybatis.mapper.UserMapper;
import com.yym.examples.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	@Override
	public User findById(Long id) {
		return userMapper.findById(id);
	}

	@Override
	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void create(User user) throws MyException {

		userMapper.insert(user);

		if (user.getId() == null){
			throw new MyException(1,"id为空");
		}
	}
}
