package com.giz.infoseekdemo.controller;


import java.util.List;
import java.util.Optional;

import com.giz.infoseekdemo.domain.Student;
import com.giz.infoseekdemo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping(path = "/{studentId}")
	public Optional<Student> getStudentById(@PathVariable long studentId){
		return studentService.getStudentById(studentId);
	}
	
	@DeleteMapping(path = "/{studentId}")
	public void deleteStudent(@PathVariable long studentId) {
		studentService.deleteStudent(studentId);
	}
	
	@PutMapping(path = "/{studentId}")
	public Student updateStudent(@PathVariable long studentId,@RequestBody Student student) {
		return studentService.updateStudent(studentId,student);
	}
	
	@GetMapping(path = "/age")
	public List<Student> getStudentByAgeLessThan(@RequestParam(value = "age") int age){
		return studentService.getStudentByAgeLessThan(age);
	}
	
	@GetMapping(path = "/name")
	public List<Student> getStudentsByFirstNameAndLastName(@RequestParam(value = "firstName") String firstName,@RequestParam(value = "lastName") String lastName){
		return studentService.getStudentsByFirstNameAndLastName(firstName,lastName);
	}
	
	@GetMapping(path = "/age/difference")
	public List<Student> getStudentsByAgeBetween(@RequestParam(value = "min") int minAge,@RequestParam(value = "max") int maxAge){
		return studentService.getStudentsByAgeBetween(minAge,maxAge);
	}

}
