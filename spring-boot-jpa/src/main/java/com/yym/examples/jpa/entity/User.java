package com.yym.examples.jpa.entity;

import javax.persistence.*;

/**
 * Created by yaoyimin on 2017/10/12
 */
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age" , nullable = false )
	private Integer age;

	@Column(name = "country" , nullable = false)
	private String country;

	@Column(name = "user_id" , nullable = false)
	private String userId;

	public User() {
	}

	public Long getId() {
		return id;
	}

	public User setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public User setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public User setCountry(String country) {
		this.country = country;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public User setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", country='" + country + '\'' +
				", userId='" + userId + '\'' +
				'}';
	}
}
