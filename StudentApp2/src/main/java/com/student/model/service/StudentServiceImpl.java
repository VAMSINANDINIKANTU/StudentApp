package com.student.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.student.model.entities.Student;
import com.student.model.repo.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepo;

	@Override
	public Student addStudent(Student student) {

		return studentrepo.save(student);
	}

	@Override
	public void deleteStudent(Long id) {

		studentrepo.deleteById(id);

	}

	@Override
	public Student updateStudent(Long id, Student student) {

		Student studenttoBeUpdated = studentrepo.findById(id).orElseThrow(StudentNotFoundException::new);
		studenttoBeUpdated.setPhoneno(student.getPhoneno());
		return studenttoBeUpdated;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id);
	}

}
