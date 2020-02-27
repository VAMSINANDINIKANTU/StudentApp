package com.student.model.service;

import java.util.List;
import java.util.Optional;


import com.student.model.entities.Student;

public interface StudentService {

	public Student addStudent(Student student);
    public void deleteStudent(Long id);
    public Student updateStudent(Long id,Student student);
    public List<Student> getAllStudents();
    public Optional<Student> findById(Long id);

}
