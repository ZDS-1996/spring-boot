package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.StudentDao;
import com.example.pojos.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return dao.findAllStudent();
		/* return null; */
	}
}
