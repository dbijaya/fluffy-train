package com.bijay.spboothibmysql.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bijay.spboothibmysql.springbootcrud.model.BloodGroup;
import com.bijay.spboothibmysql.springbootcrud.service.BloodGroupService;

@RestController
@RequestMapping("/api")
public class BloodGroupController {
	
	@Autowired
	private BloodGroupService bloodGroupService;
	
	
	@GetMapping("/user/{userId}/bloodgroup")
	public List<BloodGroup> get(){
		return bloodGroupService.get();
	}
	
	@PostMapping("/user/{userId}/bloodgroup/{id}")
	public BloodGroup save(@RequestBody BloodGroup bgObj) {
		bloodGroupService.save(bgObj);
		return bgObj;
	}

	@GetMapping("/user/{userId}/bloodgroup/{id}")
	public BloodGroup get(@PathVariable int id) {
		BloodGroup bloodgroupObj = bloodGroupService.get(id);
		if (bloodgroupObj == null) {
			throw new RuntimeException("BloodGroup with id " + id + " is not Found !!");
		}
		return bloodgroupObj;
	}

	@DeleteMapping("/user/{userId}/bloodgroup/{id}")
	public String delete(@PathVariable int id) {
		bloodGroupService.delete(id);
		return "Blood-group has been deleted with id: " + id;
	}
	
	@PutMapping("/user/{userId}/bloodgroup")
	public BloodGroup update(@RequestBody BloodGroup bgObj) {
		bloodGroupService.save(bgObj);
		return bgObj;
	}

}
