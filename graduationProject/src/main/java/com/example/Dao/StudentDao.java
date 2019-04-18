package com.example.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.example.pojos.Student;


@Mapper
public interface StudentDao {
 public List<Student> findAllStudent();
}
