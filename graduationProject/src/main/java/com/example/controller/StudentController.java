package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojos.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;
@RestController
@RequestMapping("/student-controller")
public class StudentController {
	@Autowired
	private StudentService service;
	// {RequestMethod.POST,RequestMethod.GET}
	@RequestMapping(value = "/findAllStudent",  method = RequestMethod.GET)
	@ResponseBody
	 public List<Student> findAllStudent(){
		return service.findAllStudent();
	};

}
