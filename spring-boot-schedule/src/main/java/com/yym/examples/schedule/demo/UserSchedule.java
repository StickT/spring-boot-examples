package com.yym.examples.schedule.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;


/**
 * Created by yaoyimin on 2017/11/2
 */
@Component
public class UserSchedule {

	@Autowired
	UserRepository userRepository;

	private static Logger logger = LoggerFactory.getLogger(UserSchedule.class);

	@Scheduled(fixedRate = 5000)
	public void insertUser(){
		User user = new User();
		user.setAge(60);
		user.setCountry("CN");
		user.setName("科比");
		user.setUserId(UUID.randomUUID().toString());
		userRepository.save(user);
		logger.info("insert successfully");
	}

	@Scheduled(cron = "0 45 11 * * *")
	public void deleteUser(){
		userRepository.deleteAll();
		logger.info("deleted all users");
	}
}
