package com.giz.infoseekdemo.repository;

import java.util.List;

import com.giz.infoseekdemo.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByAgeLessThan(int age);
	
	List<Student> findByFirstNameAndLastName(String firstName,String lastName);
	
	List<Student> findByAgeBetween(int minAge,int maxAge);

}
