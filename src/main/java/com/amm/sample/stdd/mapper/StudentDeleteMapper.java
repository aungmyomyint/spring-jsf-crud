package com.amm.sample.stdd.mapper;

import org.apache.ibatis.annotations.Param;

public interface StudentDeleteMapper {

	/**
	 * It is to delete a student.
	 * 
	 * @param studentId
	 *            studentId
	 * @return count of deleted
	 */
	public int deleteStudentById(@Param("studentId") int studentId);
}
