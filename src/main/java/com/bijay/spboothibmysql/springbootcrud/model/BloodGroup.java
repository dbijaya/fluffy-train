package com.bijay.spboothibmysql.springbootcrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bloodgrp_table")
public class BloodGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private User user;
	
	public BloodGroup() {
		
	}
	
	public BloodGroup(Integer id) {
		this.id = id;
	}

	public BloodGroup(Integer id, String bloodGroup, Integer userId) {
		super();
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.user = new User(userId);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "BloodGroup [id=" + id + ", bloodGroup=" + bloodGroup + ", user=" + user + "]";
	}
	
}
