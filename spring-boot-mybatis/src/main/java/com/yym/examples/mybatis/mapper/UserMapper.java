package com.yym.examples.mybatis.mapper;

import com.yym.examples.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yaoyimin on 2017/10/12
 * 一个映射xml中sql查找,一个用annotation的方法来连接数据库查找
 */
@Mapper
public interface UserMapper {

	List<User> findAll();


	@Select("SELECT * FROM USERS WHERE id=#{id}")
	@Results({
			@Result(property = "id" , column = "id"),
			@Result(property = "name" , column = "name"),
			@Result(property = "age" , column = "age"),
			@Result(property = "country" , column = "country")
	})

	User findById(@Param("id")Long id);

	void insert(@Param("user") User user);
}
