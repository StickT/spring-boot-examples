package com.yym.examples.jpa.service;

import com.yym.examples.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
public interface UserService {

	User findById(Long id);

	List<User> findByAgeBetween(Integer after,Integer before);

	Page<User> queryUserPage(Pageable pageable);
}
