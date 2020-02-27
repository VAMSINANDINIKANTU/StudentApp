package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.student.model.entities.Student;
import com.student.model.repo.StudentRepository;
@EnableTransactionManagement
@SpringBootApplication
@EntityScan(basePackages = { "com.student.model.entities", "com.student.model.repo" })
public class StudentApp2Application implements CommandLineRunner {
	@Autowired
	private StudentRepository studentrepo;

	public static void main(String[] args) {
		SpringApplication.run(StudentApp2Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student student1 = new Student("shreya", 6, "A", "Delhi", "9923456723");
//		Student student2 = new Student("Arun", 8, "B", "Bombay", "9989656723");
//		Student student3 = new Student("ram", 5, "c", "Guntur", "6463456723");
//		Student student4 = new Student("Nandu", 9, "A", "Ongole", "8763456723");
//		Student student5 = new Student("Nazz", 10, "A", "Nellore", "7683456723");
//
//		studentrepo.save(student1);
//		studentrepo.save(student2);
//		studentrepo.save(student3);
//		studentrepo.save(student4);
//		studentrepo.save(student5);

	}

}
