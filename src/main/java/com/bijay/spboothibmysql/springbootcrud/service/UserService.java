package com.bijay.spboothibmysql.springbootcrud.service;

import java.util.List;

import com.bijay.spboothibmysql.springbootcrud.model.User;

public interface UserService {
	
	List<User> get();
	
	User get(int id);
	
	void save(User user);
	
	void delete(int id);
	
}
