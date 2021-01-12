package com.bijay.spboothibmysql.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bijay.spboothibmysql.springbootcrud.dao.UserDao;
import com.bijay.spboothibmysql.springbootcrud.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public List<User> get() {
		return userDao.get();
	}
	
	@Transactional
	@Override
	public User get(int id) {
		return userDao.get(id);
	}
	
	@Transactional
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Transactional
	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

}
