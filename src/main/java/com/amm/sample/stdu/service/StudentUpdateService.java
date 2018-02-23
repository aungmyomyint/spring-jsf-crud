package com.amm.sample.stdu.service;

import com.amm.sample.stdu.dto.StudentUpdateDto;

public interface StudentUpdateService {
	/**
	 * It will update a student.
	 * 
	 * @param studentUpdateDto
	 *            studentUpdateDto
	 * @return count of updated.
	 */
	public int updateStudent(StudentUpdateDto studentUpdateDto);
	
	/**
	 * Get student information by id.
	 * 
	 * @return a student information
	 */
	public StudentUpdateDto getStudentDtoById(int studentId);
}
