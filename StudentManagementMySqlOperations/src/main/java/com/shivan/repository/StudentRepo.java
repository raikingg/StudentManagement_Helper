package com.shivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivan.dao.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, String>{

}
