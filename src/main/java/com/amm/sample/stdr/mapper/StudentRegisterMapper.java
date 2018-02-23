package com.amm.sample.stdr.mapper;

import com.amm.sample.stdr.dto.StudentRegisterDto;

public interface StudentRegisterMapper {

	/**
	 * It will insert new student.
	 * 
	 * @param studentDto
	 *            studentDto
	 */
	public int insertStudent(StudentRegisterDto studentRegisterDto);
}
