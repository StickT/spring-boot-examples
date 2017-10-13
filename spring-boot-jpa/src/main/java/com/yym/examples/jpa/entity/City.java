package com.yym.examples.jpa.entity;

import javax.persistence.*;

/**
 * Created by yaoyimin on 2017/10/13
 */
@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "CountryCode")
	private String countryCode;

	@Column(name = "District")
	private String district;

	@Column(name = "Population")
	private Long population;

	public Long getId() {
		return id;
	}

	public City setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public City setName(String name) {
		this.name = name;
		return this;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public City setCountryCode(String countryCode) {
		this.countryCode = countryCode;
		return this;
	}

	public String getDistrict() {
		return district;
	}

	public City setDistrict(String district) {
		this.district = district;
		return this;
	}

	public Long getPopulation() {
		return population;
	}

	public City setPopulation(Long population) {
		this.population = population;
		return this;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", name='" + name + '\'' +
				", countryCode='" + countryCode + '\'' +
				", district='" + district + '\'' +
				", population=" + population +
				'}';
	}
}
