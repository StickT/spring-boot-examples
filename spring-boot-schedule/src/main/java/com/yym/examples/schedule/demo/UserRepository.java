package com.yym.examples.schedule.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by yaoyimin on 2017/11/2
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>,JpaSpecificationExecutor<User> {

}
