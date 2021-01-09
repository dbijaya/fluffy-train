package com.bijay.spboothibmysql.springbootcrud.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity says entity of database.
@Table(name="") for the table_name we're using in database.
if the table name we're initializing here is different than in database then
the name="db_table_name" is compulsory.*/

@Entity
@Table(name = "tbl_employee")
public class Employee {

	/*
	 * If the name of column we're initializing is different from database column
	 * name then, we have to write @Column(name="id") like this as
	 * in @Table(name="") annotation.
	 * 
	 * @Id : for Primary Key
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY) : because it's auto-generated and unique.
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String gender;
	
	@Column
	private String department;
	
	@Column
	private Date dob;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", department=" + department + ", dob="
				+ dob + "]";
	}
}
