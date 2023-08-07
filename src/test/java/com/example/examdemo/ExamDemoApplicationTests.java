package com.example.examdemo;

import com.example.examdemo.Model.Student;
import com.example.examdemo.Repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
@DataJpaTest
class ExamDemoApplicationTests {

	@Autowired
	StudentRepository studentRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testStudent()
	{
		Student stud1 = new Student();
		stud1.setDayOfBirth(LocalDate.now());
		stud1.setTimeOfBirth(LocalDateTime.now());
		stud1.setName("Malene");
		studentRepository.save(stud1);


		Student stud2 = new Student();
		stud2.setDayOfBirth(LocalDate.now());
		stud2.setTimeOfBirth(LocalDateTime.now());
		stud2.setName("William");
		studentRepository.save(stud2);

		List<Student> list = studentRepository.findAll();
		assertEquals(2,list.size());

		studentRepository.delete(stud1);
		list = studentRepository.findAll();
	}
}
