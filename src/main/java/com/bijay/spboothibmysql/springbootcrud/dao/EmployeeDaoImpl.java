package com.bijay.spboothibmysql.springbootcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bijay.spboothibmysql.springbootcrud.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		org.hibernate.query.Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		return employeeObj;
	}

	/*
	 * here we can use ".saveOrUpdate() method instead of just ".save()" method
	 * which explicitly write new method for update. this method automatically calls
	 * update if id value is present in HTTP-request object. if not then it calls
	 * just save method.
	 */

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
//		currentSession.save(employee);
		currentSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		currentSession.delete(employeeObj);
	}

}
