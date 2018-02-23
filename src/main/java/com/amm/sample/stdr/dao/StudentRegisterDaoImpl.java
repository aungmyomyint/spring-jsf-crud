package com.amm.sample.stdr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amm.sample.stdr.dto.StudentRegisterDto;
import com.amm.sample.stdr.mapper.StudentRegisterMapper;

@Repository
public class StudentRegisterDaoImpl implements StudentRegisterDao {

	@Autowired
	private StudentRegisterMapper studentRegisterMapper;
	
	@Override
	public int insertStudent(StudentRegisterDto studentRegisterDto) {
		return studentRegisterMapper.insertStudent(studentRegisterDto);
	}

}
