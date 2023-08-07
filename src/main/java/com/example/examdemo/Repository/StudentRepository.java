package com.example.examdemo.Repository;

import com.example.examdemo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository <Student, Integer>
{
    Optional<Student> findByName(String name);
}
