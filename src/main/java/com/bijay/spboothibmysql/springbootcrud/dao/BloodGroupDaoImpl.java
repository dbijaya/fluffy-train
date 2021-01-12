package com.bijay.spboothibmysql.springbootcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bijay.spboothibmysql.springbootcrud.model.BloodGroup;

@Repository
public class BloodGroupDaoImpl implements BloodGroupDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<BloodGroup> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		org.hibernate.query.Query<BloodGroup> query = currentSession.createQuery("from BloodGroup", BloodGroup.class);
		List<BloodGroup> list = query.getResultList();
		return list;
	}

	@Override
	public BloodGroup get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		BloodGroup bloodgroupObj = currentSession.get(BloodGroup.class, id);
		return bloodgroupObj;
	}

	@Override
	public void save(BloodGroup bloodGroup) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(bloodGroup);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		BloodGroup bloodGroupObj = currentSession.get(BloodGroup.class, id);
		currentSession.delete(bloodGroupObj);
	}

}
