package com.bijay.spboothibmysql.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bijay.spboothibmysql.springbootcrud.dao.BloodGroupDao;
import com.bijay.spboothibmysql.springbootcrud.model.BloodGroup;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {
	
	@Autowired
	private BloodGroupDao bloodGroupDao;

	@Transactional
	@Override
	public List<BloodGroup> get() {
		return bloodGroupDao.get();
	}

	@Transactional
	@Override
	public BloodGroup get(int id) {
		return bloodGroupDao.get(id);
	}

	@Transactional
	@Override
	public void save(BloodGroup blooGroup) {
		bloodGroupDao.save(blooGroup);
	}

	@Transactional
	@Override
	public void delete(int id) {
		bloodGroupDao.delete(id);
	}

}
