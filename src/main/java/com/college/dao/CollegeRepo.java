package com.college.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.college.beans.College;

@Repository
public class CollegeRepo {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Integer addCollege(College college) {

		String ADD_COLLEGE = "INSERT INTO COLLEGE(NAME, LOCATION) VALUES (:NAME, :LOCATION)";

		Map<String, Object> paramMap = new HashMap<>();
		// paramMap.put("ID", college.getId());
		paramMap.put("NAME", college.getName());
		paramMap.put("LOCATION", college.getLocation());

		return namedParameterJdbcTemplate.update(ADD_COLLEGE, paramMap);

	}

}
