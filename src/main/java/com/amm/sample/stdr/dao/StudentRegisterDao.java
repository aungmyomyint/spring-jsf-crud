package com.amm.sample.stdr.dao;

import com.amm.sample.stdr.dto.StudentRegisterDto;

public interface StudentRegisterDao {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
