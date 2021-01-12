package com.bijay.spboothibmysql.springbootcrud.dao;

import java.util.List;

import com.bijay.spboothibmysql.springbootcrud.model.BloodGroup;

public interface BloodGroupDao {
	
	List<BloodGroup> get();
	
	BloodGroup get(int id);
	
	void save(BloodGroup bloodGroup);
	
	void delete(int id);

}
