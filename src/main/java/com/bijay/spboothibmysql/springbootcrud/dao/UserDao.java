package com.bijay.spboothibmysql.springbootcrud.dao;

import java.util.List;

import com.bijay.spboothibmysql.springbootcrud.model.User;

public interface UserDao {
	
	List<User> get();
	
	User get(int id);
	
	void save(User user);
	
	void delete(int id);

}
