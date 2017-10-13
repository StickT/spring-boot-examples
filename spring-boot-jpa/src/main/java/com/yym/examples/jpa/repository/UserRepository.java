package com.yym.examples.jpa.repository;

import com.yym.examples.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>,JpaSpecificationExecutor<User> {

	List<User> findByAgeBetween(Integer after,Integer before);

	Long deleteById(Long id);

}