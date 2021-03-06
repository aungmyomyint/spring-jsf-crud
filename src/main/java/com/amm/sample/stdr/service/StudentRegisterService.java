package com.amm.sample.stdr.service;

import com.amm.sample.stdr.dto.StudentRegisterDto;

public interface StudentRegisterService {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
