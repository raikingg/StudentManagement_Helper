package com.shivan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shivan.dao.Student;
import com.shivan.repository.StudentRepo;
import com.shivan.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private static RestTemplate restTemplate;
	
	//static List<Student> listOfStudentsInElasticSearchDB = (List<Student>) restTemplate.getForEntity("http://localhost:8080/student", List.class);
	

	@Override
	public Student save(Student student) {
		//System.out.println(listOfStudentsInElasticSearchDB);
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAll() {
		return studentRepo.findAll();
	}

}
