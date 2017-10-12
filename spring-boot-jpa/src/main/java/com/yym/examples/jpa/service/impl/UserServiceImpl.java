package com.yym.examples.jpa.service.impl;

import com.yym.examples.jpa.entity.User;
import com.yym.examples.jpa.repository.UserRepository;
import com.yym.examples.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	EntityManager entityManager;

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	@Override
	public List<User> findByAgeBetween(Integer after, Integer before) {
		//使用entitymaneger来创建sql查询或者更新数据
//		String sql = "select * from users where age between "+after + " and " + before ;
//		Query query = entityManager.createNativeQuery(sql);
//		return query.getResultList();
		//调用JPA接口直接查询数据
		return userRepository.findByAgeBetween(after,before);
		//使用Cri
	}

	@Override
	public Page<User> queryUserPage(Pageable pageable) {
		return userRepository.findAll(pageable);
	}
}
