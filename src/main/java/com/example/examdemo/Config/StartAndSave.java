package com.example.examdemo.Config;

import com.example.examdemo.Model.Student;
import com.example.examdemo.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Component
public class StartAndSave implements CommandLineRunner
{
    StudentRepository studentRepository;

    public StartAndSave(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    @Override
    public void run(String... args) throws Exception{
        Student stud1 = new Student();
        stud1.setDayOfBirth(LocalDate.now());
        stud1.setName("Malene");
        stud1.setTimeOfBirth(LocalDateTime.now());
        studentRepository.save(stud1);

        Student stud2 = new Student();
        stud2.setDayOfBirth(LocalDate.now().plusDays(1000));
        stud2.setName("william");
        studentRepository.save(stud2);
    }

}
