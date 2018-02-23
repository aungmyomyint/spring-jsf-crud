package com.amm.sample.stds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amm.sample.stds.dao.StudentSearchDao;
import com.amm.sample.stds.dto.StudentDto;

@Service(value = "studentSearchService")
@Transactional
public class StudentSearchServiceImpl implements StudentSearchService {
	
	@Autowired
	private StudentSearchDao studentSearchDao;

	@Override
	public List<StudentDto> getStudentDtoList() {
		return studentSearchDao.getStudentDtoList();
	}

}
