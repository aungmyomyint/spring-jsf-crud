package com.amm.sample.stds.mapper;

import java.util.List;

import com.amm.sample.stds.dto.StudentDto;

public interface StudentSearchMapper {
	/**
	 * Getting all student.
	 * 
	 * @return all student information
	 */
	public List<StudentDto> getStudentDtoList();
}
