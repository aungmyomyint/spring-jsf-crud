package com.amm.sample.stds.dao;

import java.util.List;

import com.amm.sample.stds.dto.StudentDto;

public interface StudentSearchDao {
	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
