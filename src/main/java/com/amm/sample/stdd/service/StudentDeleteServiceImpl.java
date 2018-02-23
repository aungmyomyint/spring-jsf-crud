package com.amm.sample.stdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amm.sample.stdd.dao.StudentDeleteDao;

@Service(value = "studentDeleteService")
@Transactional

public class StudentDeleteServiceImpl implements StudentDeleteService {

	@Autowired
	private StudentDeleteDao studentDeleteDao;

	@Override
	public int deleteStudentById(int studentId) {
		return studentDeleteDao.deleteStudentById(studentId);
	}
}
