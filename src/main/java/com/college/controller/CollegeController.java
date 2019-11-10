package com.college.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.beans.College;
import com.college.service.CollegeService;

@RestController
public class CollegeController {
	private static final Logger logger = LoggerFactory.getLogger(CollegeController.class);

	@Autowired
	private CollegeService collegeService;

	@PostMapping("/addCollege")
	public Integer addCollege(@RequestBody College college) {
		logger.info("before performing operation");
		return collegeService.addCollege(college);

	}

	@GetMapping("test")
	public College test() {
		College college = new College();
		college.setName("BVR");
		college.setLocation("bvrm");
		return college;
	}
}
