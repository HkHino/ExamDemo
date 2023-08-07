package com.example.examdemo.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dayOfBirth;
    private LocalDateTime timeOfBirth;

    @Column(length = 100)
    private String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public LocalDate getDayOfBirth()
    {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth)
    {
        this.dayOfBirth = dayOfBirth;
    }

    public LocalDateTime getTimeOfBirth()
    {
        return timeOfBirth;
    }

    public void setTimeOfBirth(LocalDateTime timeOfBirth)
    {
        this.timeOfBirth = timeOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
