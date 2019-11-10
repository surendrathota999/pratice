package com.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.beans.College;
import com.college.beans.Department;
import com.college.beans.Students;
import com.college.dao.CollegeRepo;

@Service
public class CollegeService {

	@Autowired
	private CollegeRepo collegeRepo;

	public Integer addCollege(College college) {

		return collegeRepo.addCollege(college);

	}
}
