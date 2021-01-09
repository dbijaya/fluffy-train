package com.bijay.spboothibmysql.springbootcrud.service;

import java.util.List;

import com.bijay.spboothibmysql.springbootcrud.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();

	Employee get(int id);

	void save(Employee employee);

	void delete(int id);

}
