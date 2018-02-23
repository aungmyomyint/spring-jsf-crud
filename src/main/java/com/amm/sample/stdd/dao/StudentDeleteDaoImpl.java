package com.amm.sample.stdd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amm.sample.stdd.mapper.StudentDeleteMapper;

@Repository
public class StudentDeleteDaoImpl implements StudentDeleteDao {

	@Autowired
	private StudentDeleteMapper studentDeleteMapper;
	
	@Override
	public int deleteStudentById(int studentId) {
		return studentDeleteMapper.deleteStudentById(studentId);
	}

}
