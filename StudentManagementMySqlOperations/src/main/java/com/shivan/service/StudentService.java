package com.shivan.service;

import java.util.List;

import com.shivan.dao.Student;

public interface StudentService {

	Student save(Student student);

	List<Student> findAll();

}
