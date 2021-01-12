package com.bijay.spboothibmysql.springbootcrud.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="dob")
	private Date dob;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private BloodGroup bloodgrp;
	
	public User() {
		
	}
	
	public User(Integer id) {
		this.id = id;
	}
	
	public User(Integer id, String name, String email, Integer age, String occupation, Date dob, Integer bloodgrp) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.occupation = occupation;
		this.dob = dob;
		this.bloodgrp = new BloodGroup(bloodgrp);
	}
	
	public BloodGroup getBloodgrp() {
		return bloodgrp;
	}

	public void setBloodgrp(BloodGroup bloodgrp) {
		this.bloodgrp = bloodgrp;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", occupation=" + occupation
				+ ", dob=" + dob + ", bloodgrp=" + bloodgrp + "]";
	}

}
