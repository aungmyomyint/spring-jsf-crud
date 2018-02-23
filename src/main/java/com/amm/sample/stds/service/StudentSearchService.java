package com.amm.sample.stds.service;

import java.util.List;

import com.amm.sample.stds.dto.StudentDto;

public interface StudentSearchService {

	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
