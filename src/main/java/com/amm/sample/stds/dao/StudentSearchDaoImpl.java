package com.amm.sample.stds.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amm.sample.stds.dto.StudentDto;
import com.amm.sample.stds.mapper.StudentSearchMapper;

@Repository
public class StudentSearchDaoImpl implements StudentSearchDao {
	
	@Autowired
	private StudentSearchMapper studentSearchMapper;

	@Override
	public List<StudentDto> getStudentDtoList() {
		return studentSearchMapper.getStudentDtoList();
	}

}
