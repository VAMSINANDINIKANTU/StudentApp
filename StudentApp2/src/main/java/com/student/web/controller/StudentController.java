package com.student.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.entities.Student;
import com.student.model.service.StudentNotFoundException;
import com.student.model.service.StudentService;

@RestController
@RequestMapping(path = "api")
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@GetMapping(path = "students", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getAllstudents() {
		return studentservice.getAllStudents();
	}

	@GetMapping(path = "student/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getAnStudent(@PathVariable(name = "id") Long id) {
		Student student = studentservice.findById(id).orElseThrow(StudentNotFoundException::new);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@PostMapping(path = "student", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentservice.addStudent(student), HttpStatus.OK);
	}

	@PutMapping(path = "student/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> updatestudent(@PathVariable(name = "id") Long id, @RequestBody Student student) {
		studentservice.updateStudent(id, student);
		return new ResponseEntity<Student>(studentservice.updateStudent(id, student), HttpStatus.OK);
	}

	@DeleteMapping(path = "student/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deletestudent(@PathVariable(name = "id") Long id) {
		studentservice.deleteStudent(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
