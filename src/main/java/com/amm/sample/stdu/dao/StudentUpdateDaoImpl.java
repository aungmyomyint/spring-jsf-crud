package com.amm.sample.stdu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amm.sample.stdu.dto.StudentUpdateDto;
import com.amm.sample.stdu.mapper.StudentUpdateMapper;

@Repository
public class StudentUpdateDaoImpl implements StudentUpdateDao {

	@Autowired
	private StudentUpdateMapper studentUpdateMapper;
	
	@Override
	public int updateStudent(StudentUpdateDto studentUpdateDto) {
		return studentUpdateMapper.updateStudent(studentUpdateDto);
	}
	
	@Override
	public StudentUpdateDto getStudentDtoById(int studentId) {
		return studentUpdateMapper.getStudentDtoById(studentId);
	}

}
