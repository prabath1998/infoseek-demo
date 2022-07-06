package com.giz.infoseekdemo.service;


import java.util.List;
import java.util.Optional;

import com.giz.infoseekdemo.domain.Student;
import com.giz.infoseekdemo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	public StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	public void deleteStudent(long studentId) {
		repository.deleteById(studentId);
		
	}

	public Student updateStudent(long studentId, Student student) {
		//Bank existingBank = bankRepository.getById(bankId);
		Student existingStudent = repository.getById(studentId);
		if (existingStudent != null) {
			existingStudent.setFirstName(student.getFirstName());
			existingStudent.setLastName(student.getLastName());
			existingStudent.setStatus(student.getStatus());
			existingStudent.setAge(student.getAge());
			existingStudent.setContactNo(student.getContactNo());
		}
		return repository.save(existingStudent);
	}

	public Optional<Student> getStudentById(long studentId) {
		return repository.findById(studentId);
	}

	public List<Student> getStudentByAgeLessThan(int age) {
		return repository.findByAgeLessThan(age);
	}

	public List<Student> getStudentsByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return repository.findByFirstNameAndLastName(firstName,lastName);
	}

	public List<Student> getStudentsByAgeBetween(int minAge, int maxAge) {
		// TODO Auto-generated method stub
		return repository.findByAgeBetween(minAge, maxAge);
	}
	
	
}
