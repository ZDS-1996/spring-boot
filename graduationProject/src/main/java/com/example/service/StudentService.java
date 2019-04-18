package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pojos.Student;
@Service
public interface StudentService {
	 public List<Student> findAllStudent();
}
